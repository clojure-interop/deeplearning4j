(ns org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StorageMetaDataEncoder]))

(defn ->storage-meta-data-encoder
  "Constructor."
  (^StorageMetaDataEncoder []
    (new StorageMetaDataEncoder )))

(def *-block-length
  "Static Constant.

  type: int"
  StorageMetaDataEncoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  StorageMetaDataEncoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  StorageMetaDataEncoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  StorageMetaDataEncoder/SCHEMA_VERSION)

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataEncoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataEncoder/workerIDCharacterEncoding )))

(defn *update-type-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataEncoder/updateTypeClassCharacterEncoding )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/workerIDHeaderLength )))

(defn *time-stamp-max-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataEncoder/timeStampMaxValue )))

(defn *init-type-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataEncoder/initTypeClassMetaAttribute meta-attribute)))

(defn *update-type-class-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/updateTypeClassHeaderLength )))

(defn *init-type-class-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/initTypeClassHeaderLength )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/typeIDHeaderLength )))

(defn *update-type-class-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/updateTypeClassId )))

(defn *time-stamp-min-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataEncoder/timeStampMinValue )))

(defn *update-type-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataEncoder/updateTypeClassMetaAttribute meta-attribute)))

(defn *init-type-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataEncoder/initTypeClassCharacterEncoding )))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/typeIDId )))

(defn *init-type-class-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/initTypeClassId )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataEncoder/typeIDMetaAttribute meta-attribute)))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataEncoder/sessionIDMetaAttribute meta-attribute)))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataEncoder/workerIDMetaAttribute meta-attribute)))

(defn *extra-meta-data-bytes-id
  "returns: `long`"
  (^Long []
    (StorageMetaDataEncoder/extraMetaDataBytesId )))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/sessionIDHeaderLength )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/workerIDId )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataEncoder/typeIDCharacterEncoding )))

(defn *time-stamp-null-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataEncoder/timeStampNullValue )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder/sessionIDId )))

(defn put-update-type-class
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putUpdateTypeClass src src-offset length))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.encodedLength))))

(defn update-type-class
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^java.lang.String value]
    (-> this (.updateTypeClass value))))

(defn put-init-type-class
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putInitTypeClass src src-offset length))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.sbeTemplateId))))

(defn offset
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.offset))))

(defn init-type-class
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^java.lang.String value]
    (-> this (.initTypeClass value))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.sbeBlockLength))))

(defn put-type-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putTypeID src src-offset length))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StorageMetaDataEncoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.sbeSchemaId))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataEncoder this]
    (-> this (.sbeSemanticType))))

(defn type-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^java.lang.String value]
    (-> this (.typeID value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataEncoder this]
    (-> this (.toString))))

(defn extra-meta-data-bytes-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder [^StorageMetaDataEncoder this ^Integer count]
    (-> this (.extraMetaDataBytesCount count))))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn time-stamp
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^Long value]
    (-> this (.timeStamp value))))

(defn limit
  "limit - `int`"
  ([^StorageMetaDataEncoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.limit))))

(defn put-session-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putSessionID src src-offset length))))

(defn put-worker-id
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putWorkerID src src-offset length))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^StorageMetaDataEncoder this]
    (-> this (.sbeSchemaVersion))))

(defn worker-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^java.lang.String value]
    (-> this (.workerID value))))

(defn session-id
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder [^StorageMetaDataEncoder this ^java.lang.String value]
    (-> this (.sessionID value))))

