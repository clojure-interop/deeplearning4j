(ns org.nd4j.nativeblas.Nd4jCpu$OpDescriptor
  "This class is very basic info holder for ops. bean/pojo pretty much."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$OpDescriptor]))

(defn ->op-descriptor
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$OpDescriptor [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$OpDescriptor p))
  (^Nd4jCpu$OpDescriptor [^Boolean allows-inplace ^Integer t-args ^Integer i-args]
    (new Nd4jCpu$OpDescriptor allows-inplace t-args i-args)))

(defn get-number-of-i-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpDescriptor this]
    (-> this (.getNumberOfIArgs))))

(defn set-input-type
  "type - `int`"
  ([^Nd4jCpu$OpDescriptor this ^Integer type]
    (-> this (.setInputType type))))

(defn get-number-of-t-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpDescriptor this]
    (-> this (.getNumberOfTArgs))))

(defn set-hash
  "hash - `long`"
  ([^Nd4jCpu$OpDescriptor this ^Long hash]
    (-> this (.setHash hash))))

(defn get-number-of-outputs
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpDescriptor this]
    (-> this (.getNumberOfOutputs))))

(defn input-type
  "returns: `(value="nd4j::ops::InputType")  int`"
  ([^Nd4jCpu$OpDescriptor this]
    (-> this (.inputType))))

(defn get-hash
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$OpDescriptor this]
    (-> this (.getHash))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCpu$OpDescriptor this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn get-op-num
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpDescriptor this]
    (-> this (.getOpNum))))

(defn get-number-of-inputs
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpDescriptor this]
    (-> this (.getNumberOfInputs))))

(defn get-op-name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCpu$OpDescriptor this]
    (-> this (.getOpName))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCpu$OpDescriptor`

  returns: `(value="bool") (value="operator ==")  boolean`"
  ([^Nd4jCpu$OpDescriptor this ^org.nd4j.nativeblas.Nd4jCpu$OpDescriptor other]
    (-> this (.equals other))))

(defn allows-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$OpDescriptor this]
    (-> this (.allowsInplace))))

(defn is-divergent
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$OpDescriptor this]
    (-> this (.isDivergent))))

