(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder]))

(defn ->update-encoder
  "Constructor."
  (^UpdateEncoder []
    (new UpdateEncoder )))

(def *-block-length
  "Static Constant.

  type: int"
  UpdateEncoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  UpdateEncoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  UpdateEncoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  UpdateEncoder/SCHEMA_VERSION)

(defn *per-parameter-stats-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/perParameterStatsId )))

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder/workerIDCharacterEncoding )))

(defn *delta-time-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/deltaTimeMinValue )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/workerIDHeaderLength )))

(defn *data-set-meta-data-class-name-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/dataSetMetaDataClassNameId )))

(defn *data-set-meta-data-bytes-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/dataSetMetaDataBytesId )))

(defn *delta-time-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/deltaTimeNullValue )))

(defn *iteration-count-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/iterationCountMaxValue )))

(defn *gc-stats-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/gcStatsId )))

(defn *stats-collection-duration-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/statsCollectionDurationMaxValue )))

(defn *memory-use-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/memoryUseId )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/typeIDHeaderLength )))

(defn *data-set-meta-data-class-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder/dataSetMetaDataClassNameMetaAttribute meta-attribute)))

(defn *time-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder/timeMaxValue )))

(defn *iteration-count-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/iterationCountMinValue )))

(defn *stats-collection-duration-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/statsCollectionDurationMinValue )))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/typeIDId )))

(defn *iteration-count-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/iterationCountNullValue )))

(defn *score-null-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder/scoreNullValue )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder/typeIDMetaAttribute meta-attribute)))

(defn *time-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder/timeNullValue )))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder/sessionIDMetaAttribute meta-attribute)))

(defn *time-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder/timeMinValue )))

(defn *layer-names-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/layerNamesId )))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder/workerIDMetaAttribute meta-attribute)))

(defn *score-max-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder/scoreMaxValue )))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/sessionIDHeaderLength )))

(defn *param-names-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/paramNamesId )))

(defn *data-set-meta-data-class-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/dataSetMetaDataClassNameHeaderLength )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/workerIDId )))

(defn *stats-collection-duration-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/statsCollectionDurationNullValue )))

(defn *data-set-meta-data-class-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder/dataSetMetaDataClassNameCharacterEncoding )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder/typeIDCharacterEncoding )))

(defn *performance-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder/performanceId )))

(defn *delta-time-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/deltaTimeMaxValue )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder/sessionIDId )))

(defn *score-min-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder/scoreMinValue )))

(defn encoded-length
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.encodedLength))))

(defn score
  "value - `double`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^Double value]
    (-> this (.score value))))

(defn put-data-set-meta-data-class-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putDataSetMetaDataClassName src src-offset length))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.sbeTemplateId))))

(defn offset
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.offset))))

(defn param-names-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.paramNamesCount count))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.sbeBlockLength))))

(defn put-type-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putTypeID src src-offset length))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateEncoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn iteration-count
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^Integer value]
    (-> this (.iterationCount value))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.sbeSchemaId))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateEncoder this]
    (-> this (.sbeSemanticType))))

(defn type-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^java.lang.String value]
    (-> this (.typeID value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateEncoder this]
    (-> this (.toString))))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn performance-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.performanceCount count))))

(defn limit
  "limit - `int`"
  ([^UpdateEncoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^UpdateEncoder this]
    (-> this (.limit))))

(defn put-session-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSessionID src src-offset length))))

(defn layer-names-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.layerNamesCount count))))

(defn put-worker-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putWorkerID src src-offset length))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^UpdateEncoder this]
    (-> this (.sbeSchemaVersion))))

(defn worker-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^java.lang.String value]
    (-> this (.workerID value))))

(defn time
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^Long value]
    (-> this (.time value))))

(defn memory-use-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.memoryUseCount count))))

(defn stats-collection-duration
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^Integer value]
    (-> this (.statsCollectionDuration value))))

(defn data-set-meta-data-class-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^java.lang.String value]
    (-> this (.dataSetMetaDataClassName value))))

(defn per-parameter-stats-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.perParameterStatsCount count))))

(defn session-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^java.lang.String value]
    (-> this (.sessionID value))))

(defn fields-present
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateEncoder this]
    (-> this (.fieldsPresent))))

(defn data-set-meta-data-bytes-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.dataSetMetaDataBytesCount count))))

(defn gc-stats-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder this ^Integer count]
    (-> this (.gcStatsCount count))))

(defn delta-time
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder [^UpdateEncoder this ^Integer value]
    (-> this (.deltaTime value))))

