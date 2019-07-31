(ns org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleContextPrototype]))

(defn ->double-context-prototype
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleContextPrototype [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleContextPrototype p))
  (^Nd4jCpu$DoubleContextPrototype []
    (new Nd4jCpu$DoubleContextPrototype )))

(defn width
  "This method returns number of inputs available in this block

  returns: `(value="unsigned long")  long`"
  ([^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.width))))

(defn get-t-arguments
  "returns: `org.bytedeco.javacpp.DoublePointer`"
  (^org.bytedeco.javacpp.DoublePointer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.getTArguments))))

(defn num-t
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.numT))))

(defn mark-inplace
  "really-inplace - `boolean`"
  ([^Nd4jCpu$DoubleContextPrototype this ^Boolean really-inplace]
    (-> this (.markInplace really-inplace))))

(defn pick-input
  "input - `int`
  index - `int`"
  ([^Nd4jCpu$DoubleContextPrototype this ^Integer input ^Integer index]
    (-> this (.pickInput input index)))
  ([^Nd4jCpu$DoubleContextPrototype this ^Integer input]
    (-> this (.pickInput input))))

(defn fill-inputs
  "inputs - `org.bytedeco.javacpp.IntPointer`"
  ([^Nd4jCpu$DoubleContextPrototype this ^org.bytedeco.javacpp.IntPointer inputs]
    (-> this (.fillInputs inputs))))

(defn node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.nodeId))))

(defn op-num
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.opNum))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype [^Nd4jCpu$DoubleContextPrototype this ^Long position]
    (-> this (.position position))))

(defn get-node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.getNodeId))))

(defn has-variables-filled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.hasVariablesFilled))))

(defn num-i
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.numI))))

(defn input
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$DoubleContextPrototype this ^Integer idx]
    (-> this (.input idx))))

(defn is-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.isInplace))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCpu$DoubleContextPrototype this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.clone))))

(defn inputs
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.inputs))))

(defn get-i-arguments
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^Nd4jCpu$DoubleContextPrototype this]
    (-> this (.getIArguments))))

