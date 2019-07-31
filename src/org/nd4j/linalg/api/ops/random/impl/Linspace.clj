(ns org.nd4j.linalg.api.ops.random.impl.Linspace
  "Linspace/arange Op implementation, generates from..to distribution within Z"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl Linspace]))

(defn ->linspace
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  from - `double`
  to - `double`
  length - `long`"
  (^Linspace [^org.nd4j.autodiff.samediff.SameDiff sd ^Double from ^Double to ^Long length]
    (new Linspace sd from to length))
  (^Linspace [^Double from ^Double to ^Integer length]
    (new Linspace from to length))
  (^Linspace []
    (new Linspace )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Linspace this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Linspace this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Linspace this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Linspace this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Linspace this]
    (-> this (.tensorflowName))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Linspace this]
    (-> this (.calculateOutputShape))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Linspace this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

