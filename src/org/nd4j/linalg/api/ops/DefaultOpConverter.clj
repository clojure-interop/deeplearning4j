(ns org.nd4j.linalg.api.ops.DefaultOpConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops DefaultOpConverter]))

(defn ->default-op-converter
  "Constructor."
  (^DefaultOpConverter []
    (new DefaultOpConverter )))

(defn *get-instance
  "returns: `org.nd4j.linalg.api.ops.DefaultOpConverter`"
  (^org.nd4j.linalg.api.ops.DefaultOpConverter []
    (DefaultOpConverter/getInstance )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DefaultOpConverter this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^DefaultOpConverter this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^DefaultOpConverter this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DefaultOpConverter this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DefaultOpConverter this]
    (-> this (.tensorflowName))))

