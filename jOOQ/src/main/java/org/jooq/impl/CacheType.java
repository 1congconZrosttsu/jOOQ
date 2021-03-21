/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;


import org.jooq.CacheProvider;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.RecordMapper;
import org.jooq.RecordType;

/**
 * The set of internal cache types.
 * <p>
 * These are all the cache types that jOOQ internally uses for caching various
 * things in a {@link Configuration}, including e.g. reflection lookups,
 * mappers, SQL translations, etc.
 * <p>
 * The actual cache implementations are provided by {@link CacheProvider} and
 * can be overridden.
 * <p>
 * See [#2965] [#8334]
 *
 * @author Lukas Eder
 */
public enum CacheType {

    /**
     * A reflection cache for lookups of JPA annotated getters in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_ANNOTATED_GETTER("org.jooq.configuration.reflection-cache.get-annotated-getter"),

    /**
     * A reflection cache for lookups of JPA annotated members in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_ANNOTATED_MEMBERS("org.jooq.configuration.reflection-cache.get-annotated-members"),

    /**
     * A reflection cache for lookups of JPA annotated setters in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_ANNOTATED_SETTERS("org.jooq.configuration.reflection-cache.get-annotated-setters"),

    /**
     * A reflection cache for lookups of getters matched by name in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_MATCHING_GETTER("org.jooq.configuration.reflection-cache.get-matching-getter"),

    /**
     * A reflection cache for lookups of members matched by name in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_MATCHING_MEMBERS("org.jooq.configuration.reflection-cache.get-matching-members"),

    /**
     * A reflection cache for lookups of setters matched by name in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_GET_MATCHING_SETTERS("org.jooq.configuration.reflection-cache.get-matching-setters"),

    /**
     * A reflection cache to check if a type has any JPA annotations at all, in
     * {@link DefaultRecordMapper}.
     */
    REFLECTION_CACHE_HAS_COLUMN_ANNOTATIONS("org.jooq.configuration.reflection-cache.has-column-annotations"),

    /**
     * A cache used by the {@link DefaultRecordMapperProvider} to cache all
     * {@link RecordMapper} instances and their possibly expensive
     * initialisations per {@link RecordType} and {@link Class} pairs.
     */
    CACHE_RECORD_MAPPERS("org.jooq.configuration.cache.record-mappers"),

    /**
     * [#8334] A cache for SQL to SQL translations in the
     * {@link DSLContext#parsingConnection()}, to speed up its usage.
     */
    CACHE_PARSING_CONNECTION("org.jooq.configuration.cache.parsing-connection");

    final String key;

    CacheType(String key) {
        this.key = key;
    }
}