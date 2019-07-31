(ns org.nd4j.linalg.api.ops.impl.transforms.ReverseV2
  "This is compatibility op for ReverseV2"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms ReverseV2]))

(defn ->reverse-v-2
  "Constructor."
  (^ReverseV2 []
    (new ReverseV2 )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ReverseV2 this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ReverseV2 this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ReverseV2 this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ReverseV2 this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

