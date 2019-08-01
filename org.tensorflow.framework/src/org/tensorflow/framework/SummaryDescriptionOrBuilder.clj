(ns org.tensorflow.framework.SummaryDescriptionOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryDescriptionOrBuilder]))

(defn get-type-hint
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryDescriptionOrBuilder this]
    (-> this (.getTypeHint))))

(defn get-type-hint-bytes
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryDescriptionOrBuilder this]
    (-> this (.getTypeHintBytes))))

