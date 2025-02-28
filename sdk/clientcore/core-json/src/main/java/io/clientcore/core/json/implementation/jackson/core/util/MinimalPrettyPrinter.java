// Original file from https://github.com/FasterXML/jackson-core under Apache-2.0 license.
package io.clientcore.core.json.implementation.jackson.core.util;

import java.io.IOException;

import io.clientcore.core.json.implementation.jackson.core.JsonGenerator;
import io.clientcore.core.json.implementation.jackson.core.PrettyPrinter;

/**
 * {@link PrettyPrinter} implementation that adds no indentation,
 * just implements everything necessary for value output to work
 * as expected, and provide simpler extension points to allow
 * for creating simple custom implementations that add specific
 * decoration or overrides. Since behavior then is very similar
 * to using no pretty printer at all, usually sub-classes are used.
 *<p>
 * Beyond purely minimal implementation, there is limited amount of
 * configurability which may be useful for actual use: for example,
 * it is possible to redefine separator used between root-level
 * values (default is single space; can be changed to line-feed).
 *<p>
 * Note: does NOT implement {@link Instantiatable} since this is
 * a stateless implementation; that is, a single instance can be
 * shared between threads.
 */
public class MinimalPrettyPrinter implements PrettyPrinter, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    protected String _rootValueSeparator;

    /**
     * @since 2.9
     */
    protected Separators _separators;

    /*
    /**********************************************************
    /* Life-cycle, construction, configuration
    /**********************************************************
     */

    public MinimalPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR.toString());
    }

    public MinimalPrettyPrinter(String rootValueSeparator) {
        _rootValueSeparator = rootValueSeparator;
        _separators = DEFAULT_SEPARATORS;
    }

    public void setRootValueSeparator(String sep) {
        _rootValueSeparator = sep;
    }

    /**
     * @param separators Separator definitions
     *
     * @return This pretty-printer instance to allow call chaining
     *
     * @since 2.9
     */
    public MinimalPrettyPrinter setSeparators(Separators separators) {
        _separators = separators;
        return this;
    }

    /*
    /**********************************************************
    /* PrettyPrinter impl
    /**********************************************************
     */

    @Override
    public void writeRootValueSeparator(JsonGenerator g) throws IOException {
        if (_rootValueSeparator != null) {
            g.writeRaw(_rootValueSeparator);
        }
    }

    @Override
    public void writeStartObject(JsonGenerator g) throws IOException {
        g.writeRaw('{');
    }

    @Override
    public void beforeObjectEntries(JsonGenerator g) throws IOException {
        // nothing special, since no indentation is added
    }

    /**
     * Method called after an object field has been output, but
     * before the value is output.
     *<p>
     * Default handling will just output a single
     * colon to separate the two, without additional spaces.
     */
    @Override
    public void writeObjectFieldValueSeparator(JsonGenerator g) throws IOException {
        g.writeRaw(_separators.getObjectFieldValueSeparator());
    }

    /**
     * Method called after an object entry (field:value) has been completely
     * output, and before another value is to be output.
     *<p>
     * Default handling (without pretty-printing) will output a single
     * comma to separate the two.
     */
    @Override
    public void writeObjectEntrySeparator(JsonGenerator g) throws IOException {
        g.writeRaw(_separators.getObjectEntrySeparator());
    }

    @Override
    public void writeEndObject(JsonGenerator g, int nrOfEntries) throws IOException {
        g.writeRaw('}');
    }

    @Override
    public void writeStartArray(JsonGenerator g) throws IOException {
        g.writeRaw('[');
    }

    @Override
    public void beforeArrayValues(JsonGenerator g) throws IOException {
        // nothing special, since no indentation is added
    }

    /**
     * Method called after an array value has been completely
     * output, and before another value is to be output.
     *<p>
     * Default handling (without pretty-printing) will output a single
     * comma to separate values.
     */
    @Override
    public void writeArrayValueSeparator(JsonGenerator g) throws IOException {
        g.writeRaw(_separators.getArrayValueSeparator());
    }

    @Override
    public void writeEndArray(JsonGenerator g, int nrOfValues) throws IOException {
        g.writeRaw(']');
    }
}
