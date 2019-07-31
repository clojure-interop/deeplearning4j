(ns org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfContextPrototype]))

(defn ->half-context-prototype
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfContextPrototype [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfContextPrototype p))
  (^Nd4jCuda$HalfContextPrototype []
    (new Nd4jCuda$HalfContextPrototype )))

(defn width
  "This method returns number of inputs available in this block

  returns: `(value="unsigned long")  long`"
  ([^Nd4jCuda$HalfContextPrototype this]
    (-> this (.width))))

(defn get-t-arguments
  "returns: `(value="float16*")   org.bytedeco.javacpp.ShortPointer`"
  ([^Nd4jCuda$HalfContextPrototype this]
    (-> this (.getTArguments))))

(defn num-t
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.numT))))

(defn mark-inplace
  "really-inplace - `boolean`"
  ([^Nd4jCuda$HalfContextPrototype this ^Boolean really-inplace]
    (-> this (.markInplace really-inplace))))

(defn pick-input
  "input - `int`
  index - `int`"
  ([^Nd4jCuda$HalfContextPrototype this ^Integer input ^Integer index]
    (-> this (.pickInput input index)))
  ([^Nd4jCuda$HalfContextPrototype this ^Integer input]
    (-> this (.pickInput input))))

(defn fill-inputs
  "inputs - `org.bytedeco.javacpp.IntPointer`"
  ([^Nd4jCuda$HalfContextPrototype this ^org.bytedeco.javacpp.IntPointer inputs]
    (-> this (.fillInputs inputs))))

(defn node-id
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.nodeId))))

(defn op-num
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.opNum))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype [^Nd4jCuda$HalfContextPrototype this ^Long position]
    (-> this (.position position))))

(defn get-node-id
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.getNodeId))))

(defn has-variables-filled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfContextPrototype this]
    (-> this (.hasVariablesFilled))))

(defn num-i
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.numI))))

(defn input
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$HalfContextPrototype this ^Integer idx]
    (-> this (.input idx))))

(defn is-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfContextPrototype this]
    (-> this (.isInplace))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCuda$HalfContextPrototype this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.clone))))

(defn inputs
  "returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.inputs))))

(defn get-i-arguments
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^Nd4jCuda$HalfContextPrototype this]
    (-> this (.getIArguments))))

