(ns com.atilika.kuromoji.buffer.BufferEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.buffer BufferEntry]))

(defn ->buffer-entry
  "Constructor."
  (^BufferEntry []
    (new BufferEntry )))

(defn token-info
  "Instance Field.

  type: java.util.List<java.lang.Short>"
  (^java.util.List [^BufferEntry this]
    (-> this .-tokenInfo)))

(defn features
  "Instance Field.

  type: java.util.List<java.lang.Integer>"
  (^java.util.List [^BufferEntry this]
    (-> this .-features)))

(defn pos-info
  "Instance Field.

  type: java.util.List<java.lang.Byte>"
  (^java.util.List [^BufferEntry this]
    (-> this .-posInfo)))

(defn token-infos
  "Instance Field.

  type: short[]"
  ([^BufferEntry this]
    (-> this .-tokenInfos)))

(defn feature-infos
  "Instance Field.

  type: int[]"
  ([^BufferEntry this]
    (-> this .-featureInfos)))

(defn pos-infos
  "Instance Field.

  type: byte[]"
  ([^BufferEntry this]
    (-> this .-posInfos)))

