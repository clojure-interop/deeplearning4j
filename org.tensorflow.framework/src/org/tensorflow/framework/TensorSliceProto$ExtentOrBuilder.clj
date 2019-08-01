(ns org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto$ExtentOrBuilder]))

(defn get-start
  "Start index of the slice, starting at 0.
  int64 start = 1;

  returns: `long`"
  (^Long [^TensorSliceProto$ExtentOrBuilder this]
    (-> this (.getStart))))

(defn get-length
  "int64 length = 2;

  returns: `long`"
  (^Long [^TensorSliceProto$ExtentOrBuilder this]
    (-> this (.getLength))))

(defn get-has-length-case
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase [^TensorSliceProto$ExtentOrBuilder this]
    (-> this (.getHasLengthCase))))

