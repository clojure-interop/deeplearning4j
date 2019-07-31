(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder]))

(defn ->update-decoder
  "Constructor."
  (^UpdateDecoder []
    (new UpdateDecoder )))

(def *-block-length
  "Static Constant.

  type: int"
  UpdateDecoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  UpdateDecoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  UpdateDecoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  UpdateDecoder/SCHEMA_VERSION)

(defn *memory-use-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/memoryUseDecoderId )))

(defn *score-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/scoreId )))

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder/workerIDCharacterEncoding )))

(defn *delta-time-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/deltaTimeMinValue )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/workerIDHeaderLength )))

(defn *data-set-meta-data-class-name-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/dataSetMetaDataClassNameId )))

(defn *time-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/timeMetaAttribute meta-attribute)))

(defn *delta-time-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/deltaTimeNullValue )))

(defn *iteration-count-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/iterationCountMaxValue )))

(defn *time-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/timeId )))

(defn *delta-time-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/deltaTimeId )))

(defn *fields-present-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/fieldsPresentMetaAttribute meta-attribute)))

(defn *stats-collection-duration-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/statsCollectionDurationMaxValue )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/typeIDHeaderLength )))

(defn *data-set-meta-data-class-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/dataSetMetaDataClassNameMetaAttribute meta-attribute)))

(defn *score-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/scoreMetaAttribute meta-attribute)))

(defn *gc-stats-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/gcStatsDecoderId )))

(defn *time-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder/timeMaxValue )))

(defn *layer-names-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/layerNamesDecoderId )))

(defn *iteration-count-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/iterationCountMinValue )))

(defn *stats-collection-duration-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/statsCollectionDurationMinValue )))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/typeIDId )))

(defn *iteration-count-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/iterationCountNullValue )))

(defn *score-null-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder/scoreNullValue )))

(defn *stats-collection-duration-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/statsCollectionDurationId )))

(defn *iteration-count-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/iterationCountId )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/typeIDMetaAttribute meta-attribute)))

(defn *time-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder/timeNullValue )))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/sessionIDMetaAttribute meta-attribute)))

(defn *time-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder/timeMinValue )))

(defn *data-set-meta-data-bytes-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/dataSetMetaDataBytesDecoderId )))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/workerIDMetaAttribute meta-attribute)))

(defn *performance-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/performanceDecoderId )))

(defn *score-max-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder/scoreMaxValue )))

(defn *stats-collection-duration-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/statsCollectionDurationMetaAttribute meta-attribute)))

(defn *delta-time-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/deltaTimeMetaAttribute meta-attribute)))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/sessionIDHeaderLength )))

(defn *data-set-meta-data-class-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/dataSetMetaDataClassNameHeaderLength )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/workerIDId )))

(defn *stats-collection-duration-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/statsCollectionDurationNullValue )))

(defn *data-set-meta-data-class-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder/dataSetMetaDataClassNameCharacterEncoding )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder/typeIDCharacterEncoding )))

(defn *per-parameter-stats-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/perParameterStatsDecoderId )))

(defn *delta-time-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/deltaTimeMaxValue )))

(defn *fields-present-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/fieldsPresentId )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder/sessionIDId )))

(defn *score-min-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder/scoreMinValue )))

(defn *param-names-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder/paramNamesDecoderId )))

(defn *iteration-count-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder/iterationCountMetaAttribute meta-attribute)))

(defn per-parameter-stats
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder [^UpdateDecoder this]
    (-> this (.perParameterStats))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.encodedLength))))

(defn get-worker-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getWorkerID dst dst-offset length))))

(defn score
  "returns: `double`"
  (^Double [^UpdateDecoder this]
    (-> this (.score))))

(defn data-set-meta-data-bytes
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder [^UpdateDecoder this]
    (-> this (.dataSetMetaDataBytes))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.sbeTemplateId))))

(defn offset
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.offset))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.sbeBlockLength))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn iteration-count
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.iterationCount))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.sbeSchemaId))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.sbeSemanticType))))

(defn data-set-meta-data-class-name-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.dataSetMetaDataClassNameLength))))

(defn type-id
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.typeID))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.toString))))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`
  acting-block-length - `int`
  acting-version - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder [^UpdateDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset ^Integer acting-block-length ^Integer acting-version]
    (-> this (.wrap buffer offset acting-block-length acting-version))))

(defn worker-id-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.workerIDLength))))

(defn get-data-set-meta-data-class-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getDataSetMetaDataClassName dst dst-offset length))))

(defn limit
  "limit - `int`"
  ([^UpdateDecoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^UpdateDecoder this]
    (-> this (.limit))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.sbeSchemaVersion))))

(defn worker-id
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.workerID))))

(defn type-id-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.typeIDLength))))

(defn time
  "returns: `long`"
  (^Long [^UpdateDecoder this]
    (-> this (.time))))

(defn stats-collection-duration
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.statsCollectionDuration))))

(defn param-names
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder [^UpdateDecoder this]
    (-> this (.paramNames))))

(defn memory-use
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder [^UpdateDecoder this]
    (-> this (.memoryUse))))

(defn get-type-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getTypeID dst dst-offset length))))

(defn data-set-meta-data-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.dataSetMetaDataClassName))))

(defn gc-stats
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder [^UpdateDecoder this]
    (-> this (.gcStats))))

(defn performance
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder [^UpdateDecoder this]
    (-> this (.performance))))

(defn layer-names
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder [^UpdateDecoder this]
    (-> this (.layerNames))))

(defn session-id-length
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.sessionIDLength))))

(defn get-session-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSessionID dst dst-offset length))))

(defn session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder this]
    (-> this (.sessionID))))

(defn fields-present
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentDecoder [^UpdateDecoder this]
    (-> this (.fieldsPresent))))

(defn delta-time
  "returns: `int`"
  (^Integer [^UpdateDecoder this]
    (-> this (.deltaTime))))

