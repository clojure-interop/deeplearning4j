(ns org.tensorflow.framework.GradientDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GradientDefOrBuilder]))

(defn get-function-name
  "The function name.
  string function_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDefOrBuilder this]
    (-> this (.getFunctionName))))

(defn get-function-name-bytes
  "The function name.
  string function_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDefOrBuilder this]
    (-> this (.getFunctionNameBytes))))

(defn get-gradient-func
  "The gradient function's name.
  string gradient_func = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDefOrBuilder this]
    (-> this (.getGradientFunc))))

(defn get-gradient-func-bytes
  "The gradient function's name.
  string gradient_func = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDefOrBuilder this]
    (-> this (.getGradientFuncBytes))))

