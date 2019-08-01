(ns org.nd4j.nativeblas.Nd4jCuda$DoubleContextPrototype
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleContextPrototype]))

(defn ->double-context-prototype
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleContextPrototype [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleContextPrototype p))
  (^Nd4jCuda$DoubleContextPrototype []
    (new Nd4jCuda$DoubleContextPrototype )))

(defn width
  "This method returns number of inputs available in this block

  returns: `(value="unsigned long")  long`"
  ([^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.width))))

(defn get-t-arguments
  "returns: `org.bytedeco.javacpp.DoublePointer`"
  (^org.bytedeco.javacpp.DoublePointer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.getTArguments))))

(defn num-t
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.numT))))

(defn mark-inplace
  "really-inplace - `boolean`"
  ([^Nd4jCuda$DoubleContextPrototype this ^Boolean really-inplace]
    (-> this (.markInplace really-inplace))))

(defn pick-input
  "input - `int`
  index - `int`"
  ([^Nd4jCuda$DoubleContextPrototype this ^Integer input ^Integer index]
    (-> this (.pickInput input index)))
  ([^Nd4jCuda$DoubleContextPrototype this ^Integer input]
    (-> this (.pickInput input))))

(defn fill-inputs
  "inputs - `org.bytedeco.javacpp.IntPointer`"
  ([^Nd4jCuda$DoubleContextPrototype this ^org.bytedeco.javacpp.IntPointer inputs]
    (-> this (.fillInputs inputs))))

(defn node-id
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.nodeId))))

(defn op-num
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.opNum))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleContextPrototype [^Nd4jCuda$DoubleContextPrototype this ^Long position]
    (-> this (.position position))))

(defn get-node-id
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.getNodeId))))

(defn has-variables-filled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.hasVariablesFilled))))

(defn num-i
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.numI))))

(defn input
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$DoubleContextPrototype this ^Integer idx]
    (-> this (.input idx))))

(defn is-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.isInplace))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCuda$DoubleContextPrototype this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleContextPrototype [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.clone))))

(defn inputs
  "returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.inputs))))

(defn get-i-arguments
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^Nd4jCuda$DoubleContextPrototype this]
    (-> this (.getIArguments))))

