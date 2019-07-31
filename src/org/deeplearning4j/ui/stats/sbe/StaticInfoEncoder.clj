(ns org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoEncoder]))

(defn ->static-info-encoder
  "Constructor."
  (^StaticInfoEncoder []
    (new StaticInfoEncoder )))

(def *-block-length
  "Static Constant.

  type: int"
  StaticInfoEncoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  StaticInfoEncoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  StaticInfoEncoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  StaticInfoEncoder/SCHEMA_VERSION)

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/workerIDCharacterEncoding )))

(defn *hw-hardware-uid-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/hwHardwareUIDMetaAttribute meta-attribute)))

(defn *sw-jvm-uid-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmUIDHeaderLength )))

(defn *sw-jvm-uid-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmUIDId )))

(defn *sw-os-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swOsNameHeaderLength )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/workerIDHeaderLength )))

(defn *sw-jvm-spec-version-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swJvmSpecVersionMetaAttribute meta-attribute)))

(defn *sw-nd-4j-backend-class-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swNd4jBackendClassHeaderLength )))

(defn *model-config-class-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelConfigClassNameHeaderLength )))

(defn *model-num-layers-min-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelNumLayersMinValue )))

(defn *model-num-params-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/modelNumParamsMaxValue )))

(defn *sw-host-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swHostNameId )))

(defn *model-config-json-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/modelConfigJsonMetaAttribute meta-attribute)))

(defn *model-config-json-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/modelConfigJsonCharacterEncoding )))

(defn *sw-jvm-uid-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swJvmUIDMetaAttribute meta-attribute)))

(defn *sw-jvm-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmNameId )))

(defn *sw-os-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swOsNameMetaAttribute meta-attribute)))

(defn *sw-nd-4j-backend-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swNd4jBackendClassMetaAttribute meta-attribute)))

(defn *sw-jvm-version-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmVersionId )))

(defn *sw-jvm-spec-version-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swJvmSpecVersionCharacterEncoding )))

(defn *model-config-json-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelConfigJsonId )))

(defn *sw-arch-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swArchCharacterEncoding )))

(defn *model-num-layers-null-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelNumLayersNullValue )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/typeIDHeaderLength )))

(defn *model-config-class-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/modelConfigClassNameMetaAttribute meta-attribute)))

(defn *hw-jvm-max-memory-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwJvmMaxMemoryNullValue )))

(defn *hw-jvm-max-memory-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwJvmMaxMemoryMinValue )))

(defn *hw-offheap-max-memory-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwOffheapMaxMemoryNullValue )))

(defn *model-config-class-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelConfigClassNameId )))

(defn *hw-num-devices-null-value
  "returns: `short`"
  (^Short []
    (StaticInfoEncoder/hwNumDevicesNullValue )))

(defn *model-param-names-id
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/modelParamNamesId )))

(defn *hw-offheap-max-memory-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwOffheapMaxMemoryMaxValue )))

(defn *hw-hardware-uid-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/hwHardwareUIDHeaderLength )))

(defn *model-config-json-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelConfigJsonHeaderLength )))

(defn *time-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/timeMaxValue )))

(defn *sw-nd-4j-data-type-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swNd4jDataTypeNameMetaAttribute meta-attribute)))

(defn *sw-jvm-version-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swJvmVersionMetaAttribute meta-attribute)))

(defn *sw-host-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swHostNameHeaderLength )))

(defn *model-num-params-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/modelNumParamsNullValue )))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/typeIDId )))

(defn *sw-jvm-spec-version-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmSpecVersionHeaderLength )))

(defn *hw-num-devices-min-value
  "returns: `short`"
  (^Short []
    (StaticInfoEncoder/hwNumDevicesMinValue )))

(defn *sw-os-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swOsNameId )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/typeIDMetaAttribute meta-attribute)))

(defn *sw-jvm-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmNameHeaderLength )))

(defn *sw-host-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swHostNameMetaAttribute meta-attribute)))

(defn *time-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/timeNullValue )))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/sessionIDMetaAttribute meta-attribute)))

(defn *time-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/timeMinValue )))

(defn *hw-hardware-uid-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/hwHardwareUIDCharacterEncoding )))

(defn *sw-arch-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swArchId )))

(defn *sw-nd-4j-data-type-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swNd4jDataTypeNameId )))

(defn *model-num-params-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/modelNumParamsMinValue )))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/workerIDMetaAttribute meta-attribute)))

(defn *sw-nd-4j-backend-class-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swNd4jBackendClassId )))

(defn *hw-hardware-uid-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/hwHardwareUIDId )))

(defn *sw-jvm-uid-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swJvmUIDCharacterEncoding )))

(defn *hw-jvm-max-memory-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwJvmMaxMemoryMaxValue )))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/sessionIDHeaderLength )))

(defn *sw-jvm-version-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swJvmVersionCharacterEncoding )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/workerIDId )))

(defn *hw-offheap-max-memory-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwOffheapMaxMemoryMinValue )))

(defn *sw-jvm-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swJvmNameMetaAttribute meta-attribute)))

(defn *hw-jvm-processors-null-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/hwJvmProcessorsNullValue )))

(defn *sw-os-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swOsNameCharacterEncoding )))

(defn *hw-device-info-group-id
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/hwDeviceInfoGroupId )))

(defn *sw-host-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swHostNameCharacterEncoding )))

(defn *hw-jvm-processors-min-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/hwJvmProcessorsMinValue )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/typeIDCharacterEncoding )))

(defn *sw-nd-4j-data-type-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swNd4jDataTypeNameCharacterEncoding )))

(defn *model-num-layers-max-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/modelNumLayersMaxValue )))

(defn *sw-nd-4j-backend-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swNd4jBackendClassCharacterEncoding )))

(defn *sw-jvm-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/swJvmNameCharacterEncoding )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/sessionIDId )))

(defn *sw-environment-info-id
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder/swEnvironmentInfoId )))

(defn *sw-jvm-version-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmVersionHeaderLength )))

(defn *model-config-class-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder/modelConfigClassNameCharacterEncoding )))

(defn *hw-num-devices-max-value
  "returns: `short`"
  (^Short []
    (StaticInfoEncoder/hwNumDevicesMaxValue )))

(defn *hw-jvm-processors-max-value
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/hwJvmProcessorsMaxValue )))

(defn *sw-nd-4j-data-type-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swNd4jDataTypeNameHeaderLength )))

(defn *sw-arch-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swArchHeaderLength )))

(defn *sw-arch-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder/swArchMetaAttribute meta-attribute)))

(defn *sw-jvm-spec-version-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder/swJvmSpecVersionId )))

(defn model-config-json
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.modelConfigJson value))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.encodedLength))))

(defn sw-os-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swOsName value))))

(defn hw-offheap-max-memory
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Long value]
    (-> this (.hwOffheapMaxMemory value))))

(defn put-sw-nd-4j-data-type-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwNd4jDataTypeName src src-offset length))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.sbeTemplateId))))

(defn put-sw-nd-4j-backend-class
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwNd4jBackendClass src src-offset length))))

(defn offset
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.offset))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.sbeBlockLength))))

(defn put-type-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putTypeID src src-offset length))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StaticInfoEncoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn model-num-params
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Long value]
    (-> this (.modelNumParams value))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.sbeSchemaId))))

(defn put-sw-jvm-uid
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwJvmUID src src-offset length))))

(defn hw-jvm-processors
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Integer value]
    (-> this (.hwJvmProcessors value))))

(defn put-model-config-json
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putModelConfigJson src src-offset length))))

(defn hw-hardware-uid
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.hwHardwareUID value))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoEncoder this]
    (-> this (.sbeSemanticType))))

(defn put-sw-host-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwHostName src src-offset length))))

(defn type-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.typeID value))))

(defn sw-jvm-version
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swJvmVersion value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoEncoder this]
    (-> this (.toString))))

(defn sw-host-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swHostName value))))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn put-sw-jvm-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwJvmName src src-offset length))))

(defn hw-jvm-max-memory
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Long value]
    (-> this (.hwJvmMaxMemory value))))

(defn put-sw-jvm-version
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwJvmVersion src src-offset length))))

(defn hw-device-info-group-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder [^StaticInfoEncoder this ^Integer count]
    (-> this (.hwDeviceInfoGroupCount count))))

(defn model-config-class-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.modelConfigClassName value))))

(defn sw-nd-4j-data-type-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swNd4jDataTypeName value))))

(defn limit
  "limit - `int`"
  ([^StaticInfoEncoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^StaticInfoEncoder this]
    (-> this (.limit))))

(defn sw-environment-info-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder this ^Integer count]
    (-> this (.swEnvironmentInfoCount count))))

(defn put-session-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSessionID src src-offset length))))

(defn sw-jvm-spec-version
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swJvmSpecVersion value))))

(defn put-worker-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putWorkerID src src-offset length))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^StaticInfoEncoder this]
    (-> this (.sbeSchemaVersion))))

(defn put-sw-os-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwOsName src src-offset length))))

(defn put-sw-jvm-spec-version
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwJvmSpecVersion src src-offset length))))

(defn worker-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.workerID value))))

(defn time
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Long value]
    (-> this (.time value))))

(defn put-hw-hardware-uid
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putHwHardwareUID src src-offset length))))

(defn sw-jvm-uid
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swJvmUID value))))

(defn sw-jvm-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swJvmName value))))

(defn put-sw-arch
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSwArch src src-offset length))))

(defn put-model-config-class-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putModelConfigClassName src src-offset length))))

(defn sw-nd-4j-backend-class
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swNd4jBackendClass value))))

(defn model-num-layers
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Integer value]
    (-> this (.modelNumLayers value))))

(defn session-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.sessionID value))))

(defn fields-present
  "returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^StaticInfoEncoder this]
    (-> this (.fieldsPresent))))

(defn hw-num-devices
  "value - `short`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^Short value]
    (-> this (.hwNumDevices value))))

(defn model-param-names-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder [^StaticInfoEncoder this ^Integer count]
    (-> this (.modelParamNamesCount count))))

(defn sw-arch
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder [^StaticInfoEncoder this ^java.lang.String value]
    (-> this (.swArch value))))

