(ns org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StorageMetaDataDecoder]))

(defn ->storage-meta-data-decoder
  "Constructor."
  (^StorageMetaDataDecoder []
    (new StorageMetaDataDecoder )))

(def *-block-length
  "Static Constant.

  type: int"
  StorageMetaDataDecoder/BLOCK_LENGTH)

(def *-template-id
  "Static Constant.

  type: int"
  StorageMetaDataDecoder/TEMPLATE_ID)

(def *-schema-id
  "Static Constant.

  type: int"
  StorageMetaDataDecoder/SCHEMA_ID)

(def *-schema-version
  "Static Constant.

  type: int"
  StorageMetaDataDecoder/SCHEMA_VERSION)

(defn *session-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataDecoder/sessionIDCharacterEncoding )))

(defn *worker-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataDecoder/workerIDCharacterEncoding )))

(defn *update-type-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataDecoder/updateTypeClassCharacterEncoding )))

(defn *worker-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/workerIDHeaderLength )))

(defn *time-stamp-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/timeStampId )))

(defn *time-stamp-max-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataDecoder/timeStampMaxValue )))

(defn *init-type-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/initTypeClassMetaAttribute meta-attribute)))

(defn *update-type-class-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/updateTypeClassHeaderLength )))

(defn *init-type-class-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/initTypeClassHeaderLength )))

(defn *type-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/typeIDHeaderLength )))

(defn *update-type-class-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/updateTypeClassId )))

(defn *time-stamp-min-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataDecoder/timeStampMinValue )))

(defn *update-type-class-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/updateTypeClassMetaAttribute meta-attribute)))

(defn *init-type-class-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataDecoder/initTypeClassCharacterEncoding )))

(defn *type-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/typeIDId )))

(defn *init-type-class-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/initTypeClassId )))

(defn *type-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/typeIDMetaAttribute meta-attribute)))

(defn *session-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/sessionIDMetaAttribute meta-attribute)))

(defn *worker-id-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/workerIDMetaAttribute meta-attribute)))

(defn *time-stamp-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder/timeStampMetaAttribute meta-attribute)))

(defn *extra-meta-data-bytes-decoder-id
  "returns: `long`"
  (^Long []
    (StorageMetaDataDecoder/extraMetaDataBytesDecoderId )))

(defn *session-id-header-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/sessionIDHeaderLength )))

(defn *worker-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/workerIDId )))

(defn *type-id-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StorageMetaDataDecoder/typeIDCharacterEncoding )))

(defn *time-stamp-null-value
  "returns: `long`"
  (^Long []
    (StorageMetaDataDecoder/timeStampNullValue )))

(defn *session-id-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder/sessionIDId )))

(defn encoded-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.encodedLength))))

(defn get-worker-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StorageMetaDataDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getWorkerID dst dst-offset length))))

(defn update-type-class
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.updateTypeClass))))

(defn sbe-template-id
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.sbeTemplateId))))

(defn offset
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.offset))))

(defn init-type-class
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.initTypeClass))))

(defn sbe-block-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.sbeBlockLength))))

(defn update-type-class-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.updateTypeClassLength))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StorageMetaDataDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn sbe-schema-id
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.sbeSchemaId))))

(defn sbe-semantic-type
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.sbeSemanticType))))

(defn type-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.typeID))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.toString))))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`
  acting-block-length - `int`
  acting-version - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder [^StorageMetaDataDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset ^Integer acting-block-length ^Integer acting-version]
    (-> this (.wrap buffer offset acting-block-length acting-version))))

(defn worker-id-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.workerIDLength))))

(defn time-stamp
  "returns: `long`"
  (^Long [^StorageMetaDataDecoder this]
    (-> this (.timeStamp))))

(defn limit
  "limit - `int`"
  ([^StorageMetaDataDecoder this ^Integer limit]
    (-> this (.limit limit)))
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.limit))))

(defn extra-meta-data-bytes
  "returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder [^StorageMetaDataDecoder this]
    (-> this (.extraMetaDataBytes))))

(defn sbe-schema-version
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.sbeSchemaVersion))))

(defn worker-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.workerID))))

(defn type-id-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.typeIDLength))))

(defn get-init-type-class
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StorageMetaDataDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getInitTypeClass dst dst-offset length))))

(defn get-type-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StorageMetaDataDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getTypeID dst dst-offset length))))

(defn session-id-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.sessionIDLength))))

(defn init-type-class-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder this]
    (-> this (.initTypeClassLength))))

(defn get-session-id
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StorageMetaDataDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getSessionID dst dst-offset length))))

(defn session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder this]
    (-> this (.sessionID))))

(defn get-update-type-class
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StorageMetaDataDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getUpdateTypeClass dst dst-offset length))))

