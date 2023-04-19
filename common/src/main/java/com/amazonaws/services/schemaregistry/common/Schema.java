/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates.
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.schemaregistry.common;

import java.util.Objects;

/**
 * Schema entity represents a schema and it's properties stored in Glue Schema Registry.
 */
public class Schema {
    /**
     * Schema Definition contains the string representation of schema version stored during registration.
     */
    private String schemaDefinition;

    /**
     * Data Format represents the string notation of data format used during registration of schea. Ex: Avro, JSON etc.
     */
    private String dataFormat;

    /**
     * Schema Name represents name of the schema under which the schema version was registered.
     */
    private String schemaName;

    /**
     * Schema Version represents version of the schema under which the schema version was registered.
     */
    private Long schemaVersion;

    public Schema(String schemaDefinition, String dataFormat, String schemaName) {
        this.schemaDefinition = schemaDefinition;
        this.dataFormat = dataFormat;
        this.schemaName = schemaName;
    }

    public Schema(String schemaDefinition, String dataFormat, String schemaName, Long schemaVersion) {
        this.schemaDefinition = schemaDefinition;
        this.dataFormat = dataFormat;
        this.schemaName = schemaName;
        this.schemaVersion = schemaVersion;
    }

    public String getSchemaDefinition() {
        return schemaDefinition;
    }

    public void setSchemaDefinition(String schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public Long getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schema schema = (Schema) o;
        return Objects.equals(schemaDefinition, schema.schemaDefinition) && Objects.equals(dataFormat, schema.dataFormat) && Objects.equals(schemaName, schema.schemaName) && Objects.equals(schemaVersion, schema.schemaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaDefinition, dataFormat, schemaName, schemaVersion);
    }
}
