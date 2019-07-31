(ns org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoDecoder]))

(defn ->static-info-decoder
  "Constructor."
  (^StaticInfoDecoder []
    (new StaticInfoDecoder )))

(def *-block-length
  "Static Constant.

  type: int"
  StaticInfoDecoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  StaticInfoDecoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  StaticInfoDecoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  StaticInfoDecoder/SCHEMA_VERSION)

(defn *hw-offheap-max-memory-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/hwOffheapMaxMemoryMetaAttribute meta-attribute)))

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/workerIDCharacterEncoding )))

(defn *hw-hardware-uid-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/hwHardwareUIDMetaAttribute meta-attribute)))

(defn *sw-jvm-uid-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmUIDHeaderLength )))

(defn *hw-device-info-group-decoder-id
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwDeviceInfoGroupDecoderId )))

(defn *sw-jvm-uid-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmUIDId )))

(defn *model-num-params-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelNumParamsId )))

(defn *sw-os-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swOsNameHeaderLength )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/workerIDHeaderLength )))

(defn *sw-jvm-spec-version-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swJvmSpecVersionMetaAttribute meta-attribute)))

(defn *sw-nd-4j-backend-class-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swNd4jBackendClassHeaderLength )))

(defn *hw-jvm-processors-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/hwJvmProcessorsMetaAttribute meta-attribute)))

(defn *time-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/timeMetaAttribute meta-attribute)))

(defn *hw-jvm-max-memory-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwJvmMaxMemoryId )))

(defn *model-config-class-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelConfigClassNameHeaderLength )))

(defn *model-num-layers-min-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelNumLayersMinValue )))

(defn *model-num-params-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/modelNumParamsMaxValue )))

(defn *time-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/timeId )))

(defn *sw-host-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swHostNameId )))

(defn *model-config-json-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/modelConfigJsonMetaAttribute meta-attribute)))

(defn *fields-present-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/fieldsPresentMetaAttribute meta-attribute)))

(defn *model-config-json-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/modelConfigJsonCharacterEncoding )))

(defn *sw-jvm-uid-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swJvmUIDMetaAttribute meta-attribute)))

(defn *sw-jvm-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmNameId )))

(defn *sw-os-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swOsNameMetaAttribute meta-attribute)))

(defn *hw-num-devices-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwNumDevicesId )))

(defn *sw-nd-4j-backend-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swNd4jBackendClassMetaAttribute meta-attribute)))

(defn *sw-jvm-version-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmVersionId )))

(defn *sw-jvm-spec-version-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swJvmSpecVersionCharacterEncoding )))

(defn *model-config-json-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelConfigJsonId )))

(defn *sw-arch-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swArchCharacterEncoding )))

(defn *model-num-layers-null-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelNumLayersNullValue )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/typeIDHeaderLength )))

(defn *model-config-class-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/modelConfigClassNameMetaAttribute meta-attribute)))

(defn *hw-jvm-max-memory-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwJvmMaxMemoryNullValue )))

(defn *hw-jvm-max-memory-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwJvmMaxMemoryMinValue )))

(defn *hw-offheap-max-memory-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwOffheapMaxMemoryNullValue )))

(defn *model-config-class-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelConfigClassNameId )))

(defn *model-num-layers-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/modelNumLayersMetaAttribute meta-attribute)))

(defn *hw-num-devices-null-value
  "returns: `short`"
  (^Short []
    (StaticInfoDecoder/hwNumDevicesNullValue )))

(defn *hw-offheap-max-memory-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwOffheapMaxMemoryMaxValue )))

(defn *hw-hardware-uid-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwHardwareUIDHeaderLength )))

(defn *model-config-json-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelConfigJsonHeaderLength )))

(defn *time-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/timeMaxValue )))

(defn *sw-nd-4j-data-type-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swNd4jDataTypeNameMetaAttribute meta-attribute)))

(defn *sw-jvm-version-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swJvmVersionMetaAttribute meta-attribute)))

(defn *sw-host-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swHostNameHeaderLength )))

(defn *model-num-params-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/modelNumParamsNullValue )))

(defn *hw-num-devices-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/hwNumDevicesMetaAttribute meta-attribute)))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/typeIDId )))

(defn *sw-jvm-spec-version-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmSpecVersionHeaderLength )))

(defn *hw-num-devices-min-value
  "returns: `short`"
  (^Short []
    (StaticInfoDecoder/hwNumDevicesMinValue )))

(defn *sw-os-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swOsNameId )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/typeIDMetaAttribute meta-attribute)))

(defn *sw-jvm-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmNameHeaderLength )))

(defn *sw-host-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swHostNameMetaAttribute meta-attribute)))

(defn *time-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/timeNullValue )))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/sessionIDMetaAttribute meta-attribute)))

(defn *time-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/timeMinValue )))

(defn *hw-hardware-uid-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/hwHardwareUIDCharacterEncoding )))

(defn *sw-arch-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swArchId )))

(defn *sw-nd-4j-data-type-name-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swNd4jDataTypeNameId )))

(defn *model-num-params-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/modelNumParamsMinValue )))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/workerIDMetaAttribute meta-attribute)))

(defn *sw-nd-4j-backend-class-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swNd4jBackendClassId )))

(defn *hw-hardware-uid-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwHardwareUIDId )))

(defn *sw-jvm-uid-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swJvmUIDCharacterEncoding )))

(defn *hw-jvm-max-memory-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/hwJvmMaxMemoryMetaAttribute meta-attribute)))

(defn *model-num-layers-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelNumLayersId )))

(defn *hw-jvm-max-memory-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwJvmMaxMemoryMaxValue )))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/sessionIDHeaderLength )))

(defn *hw-offheap-max-memory-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwOffheapMaxMemoryId )))

(defn *sw-jvm-version-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swJvmVersionCharacterEncoding )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/workerIDId )))

(defn *hw-offheap-max-memory-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/hwOffheapMaxMemoryMinValue )))

(defn *sw-jvm-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swJvmNameMetaAttribute meta-attribute)))

(defn *model-num-params-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/modelNumParamsMetaAttribute meta-attribute)))

(defn *hw-jvm-processors-null-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwJvmProcessorsNullValue )))

(defn *hw-jvm-processors-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwJvmProcessorsId )))

(defn *sw-os-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swOsNameCharacterEncoding )))

(defn *sw-host-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swHostNameCharacterEncoding )))

(defn *hw-jvm-processors-min-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwJvmProcessorsMinValue )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/typeIDCharacterEncoding )))

(defn *sw-nd-4j-data-type-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swNd4jDataTypeNameCharacterEncoding )))

(defn *model-num-layers-max-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/modelNumLayersMaxValue )))

(defn *sw-nd-4j-backend-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swNd4jBackendClassCharacterEncoding )))

(defn *sw-jvm-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/swJvmNameCharacterEncoding )))

(defn *fields-present-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/fieldsPresentId )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/sessionIDId )))

(defn *sw-environment-info-decoder-id
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/swEnvironmentInfoDecoderId )))

(defn *sw-jvm-version-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmVersionHeaderLength )))

(defn *model-config-class-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder/modelConfigClassNameCharacterEncoding )))

(defn *hw-num-devices-max-value
  "returns: `short`"
  (^Short []
    (StaticInfoDecoder/hwNumDevicesMaxValue )))

(defn *hw-jvm-processors-max-value
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/hwJvmProcessorsMaxValue )))

(defn *sw-nd-4j-data-type-name-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swNd4jDataTypeNameHeaderLength )))

(defn *sw-arch-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swArchHeaderLength )))

(defn *sw-arch-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder/swArchMetaAttribute meta-attribute)))

(defn *model-param-names-decoder-id
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder/modelParamNamesDecoderId )))

(defn *sw-jvm-spec-version-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder/swJvmSpecVersionId )))

(defn model-config-json
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.modelConfigJson))))

(defn sw-environment-info
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder [^StaticInfoDecoder this]
    (-> this (.swEnvironmentInfo))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.encodedLength))))

(defn get-worker-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getWorkerID dst dst-offset length))))

(defn sw-os-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swOsName))))

(defn get-model-config-json
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getModelConfigJson dst dst-offset length))))

(defn get-sw-jvm-version
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwJvmVersion dst dst-offset length))))

(defn model-param-names
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder [^StaticInfoDecoder this]
    (-> this (.modelParamNames))))

(defn hw-offheap-max-memory
  "returns: `long`"
  (^Long [^StaticInfoDecoder this]
    (-> this (.hwOffheapMaxMemory))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.sbeTemplateId))))

(defn offset
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.offset))))

(defn sw-jvm-spec-version-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swJvmSpecVersionLength))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.sbeBlockLength))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StaticInfoDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn model-num-params
  "returns: `long`"
  (^Long [^StaticInfoDecoder this]
    (-> this (.modelNumParams))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.sbeSchemaId))))

(defn get-sw-nd-4j-data-type-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwNd4jDataTypeName dst dst-offset length))))

(defn hw-jvm-processors
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.hwJvmProcessors))))

(defn hw-hardware-uid
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.hwHardwareUID))))

(defn model-config-class-name-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.modelConfigClassNameLength))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.sbeSemanticType))))

(defn type-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.typeID))))

(defn sw-jvm-version
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swJvmVersion))))

(defn sw-jvm-uid-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swJvmUIDLength))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.toString))))

(defn sw-host-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swHostName))))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`
  acting-block-length - `int`
  acting-version - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder [^StaticInfoDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset ^Integer acting-block-length ^Integer acting-version]
    (-> this (.wrap buffer offset acting-block-length acting-version))))

(defn sw-os-name-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swOsNameLength))))

(defn hw-jvm-max-memory
  "returns: `long`"
  (^Long [^StaticInfoDecoder this]
    (-> this (.hwJvmMaxMemory))))

(defn worker-id-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.workerIDLength))))

(defn get-sw-jvm-uid
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwJvmUID dst dst-offset length))))

(defn get-model-config-class-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getModelConfigClassName dst dst-offset length))))

(defn model-config-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.modelConfigClassName))))

(defn sw-nd-4j-data-type-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swNd4jDataTypeName))))

(defn limit
  "limit - `int`"
  ([^StaticInfoDecoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^StaticInfoDecoder this]
    (-> this (.limit))))

(defn sw-host-name-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swHostNameLength))))

(defn get-sw-os-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwOsName dst dst-offset length))))

(defn model-config-json-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.modelConfigJsonLength))))

(defn sw-jvm-spec-version
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swJvmSpecVersion))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.sbeSchemaVersion))))

(defn sw-arch-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swArchLength))))

(defn sw-nd-4j-backend-class-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swNd4jBackendClassLength))))

(defn worker-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.workerID))))

(defn type-id-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.typeIDLength))))

(defn time
  "returns: `long`"
  (^Long [^StaticInfoDecoder this]
    (-> this (.time))))

(defn sw-jvm-name-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swJvmNameLength))))

(defn sw-jvm-version-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swJvmVersionLength))))

(defn get-sw-arch
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwArch dst dst-offset length))))

(defn get-sw-nd-4j-backend-class
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwNd4jBackendClass dst dst-offset length))))

(defn hw-device-info-group
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder [^StaticInfoDecoder this]
    (-> this (.hwDeviceInfoGroup))))

(defn hw-hardware-uid-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.hwHardwareUIDLength))))

(defn sw-jvm-uid
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swJvmUID))))

(defn get-sw-jvm-spec-version
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwJvmSpecVersion dst dst-offset length))))

(defn sw-jvm-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swJvmName))))

(defn get-type-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getTypeID dst dst-offset length))))

(defn sw-nd-4j-backend-class
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swNd4jBackendClass))))

(defn model-num-layers
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.modelNumLayers))))

(defn sw-nd-4j-data-type-name-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.swNd4jDataTypeNameLength))))

(defn session-id-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder this]
    (-> this (.sessionIDLength))))

(defn get-sw-jvm-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwJvmName dst dst-offset length))))

(defn get-session-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSessionID dst dst-offset length))))

(defn session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.sessionID))))

(defn fields-present
  "returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentDecoder [^StaticInfoDecoder this]
    (-> this (.fieldsPresent))))

(defn hw-num-devices
  "returns: `short`"
  (^Short [^StaticInfoDecoder this]
    (-> this (.hwNumDevices))))

(defn get-hw-hardware-uid
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getHwHardwareUID dst dst-offset length))))

(defn sw-arch
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder this]
    (-> this (.swArch))))

(defn get-sw-host-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSwHostName dst dst-offset length))))

