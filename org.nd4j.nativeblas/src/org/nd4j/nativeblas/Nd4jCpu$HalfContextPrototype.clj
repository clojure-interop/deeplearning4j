(ns org.nd4j.nativeblas.Nd4jCpu$HalfContextPrototype
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfContextPrototype]))

(defn ->half-context-prototype
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfContextPrototype [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfContextPrototype p))
  (^Nd4jCpu$HalfContextPrototype []
    (new Nd4jCpu$HalfContextPrototype )))

(defn width
  "This method returns number of inputs available in this block

  returns: `(value="unsigned long")  long`"
  ([^Nd4jCpu$HalfContextPrototype this]
    (-> this (.width))))

(defn get-t-arguments
  "returns: `(value="float16*")   org.bytedeco.javacpp.ShortPointer`"
  ([^Nd4jCpu$HalfContextPrototype this]
    (-> this (.getTArguments))))

(defn num-t
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.numT))))

(defn mark-inplace
  "really-inplace - `boolean`"
  ([^Nd4jCpu$HalfContextPrototype this ^Boolean really-inplace]
    (-> this (.markInplace really-inplace))))

(defn pick-input
  "input - `int`
  index - `int`"
  ([^Nd4jCpu$HalfContextPrototype this ^Integer input ^Integer index]
    (-> this (.pickInput input index)))
  ([^Nd4jCpu$HalfContextPrototype this ^Integer input]
    (-> this (.pickInput input))))

(defn fill-inputs
  "inputs - `org.bytedeco.javacpp.IntPointer`"
  ([^Nd4jCpu$HalfContextPrototype this ^org.bytedeco.javacpp.IntPointer inputs]
    (-> this (.fillInputs inputs))))

(defn node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.nodeId))))

(defn op-num
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.opNum))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfContextPrototype [^Nd4jCpu$HalfContextPrototype this ^Long position]
    (-> this (.position position))))

(defn get-node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.getNodeId))))

(defn has-variables-filled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfContextPrototype this]
    (-> this (.hasVariablesFilled))))

(defn num-i
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.numI))))

(defn input
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$HalfContextPrototype this ^Integer idx]
    (-> this (.input idx))))

(defn is-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfContextPrototype this]
    (-> this (.isInplace))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCpu$HalfContextPrototype this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfContextPrototype [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.clone))))

(defn inputs
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.inputs))))

(defn get-i-arguments
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^Nd4jCpu$HalfContextPrototype this]
    (-> this (.getIArguments))))

