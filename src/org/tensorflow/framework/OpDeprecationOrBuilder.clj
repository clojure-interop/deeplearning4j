(ns org.tensorflow.framework.OpDeprecationOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDeprecationOrBuilder]))

(defn get-version
  "First GraphDef version at which the op is disallowed.
  int32 version = 1;

  returns: `int`"
  (^Integer [^OpDeprecationOrBuilder this]
    (-> this (.getVersion))))

(defn get-explanation
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDeprecationOrBuilder this]
    (-> this (.getExplanation))))

(defn get-explanation-bytes
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDeprecationOrBuilder this]
    (-> this (.getExplanationBytes))))

