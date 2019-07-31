(ns org.nd4j.rng.NativeRandom
  "Basic NativeRandom implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.rng NativeRandom]))

(defn ->native-random
  "Constructor.

  seed - `long`
  number-of-elements - `long`"
  (^NativeRandom [^Long seed ^Long number-of-elements]
    (new NativeRandom seed number-of-elements))
  (^NativeRandom [^Long seed]
    (new NativeRandom seed))
  (^NativeRandom []
    (new NativeRandom )))

(defn get-state-buffer
  "This method returns pointer to RNG buffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^NativeRandom this]
    (-> this (.getStateBuffer))))

(defn set-seed
  "Description copied from interface: Random

  seed - the seed value - `int`"
  ([^NativeRandom this ^Integer seed]
    (-> this (.setSeed seed))))

(defn get-position
  "returns: `int`"
  (^Integer [^NativeRandom this]
    (-> this (.getPosition))))

(defn next-float
  "Description copied from interface: Random

  order - `char`
  shape - `int[]`

  returns: the generated uniform numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this ^Character order shape]
    (-> this (.nextFloat order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this shape]
    (-> this (.nextFloat shape)))
  (^Float [^NativeRandom this]
    (-> this (.nextFloat))))

(defn next-int
  "Description copied from interface: Random

  a - `int`
  n - `int`

  returns: a pseudorandom, uniformly distributed int
  value between 0 (inclusive) and n (exclusive). - `int`"
  (^Integer [^NativeRandom this ^Integer a ^Integer n]
    (-> this (.nextInt a n)))
  (^Integer [^NativeRandom this ^Integer to]
    (-> this (.nextInt to)))
  (^Integer [^NativeRandom this]
    (-> this (.nextInt))))

(defn get-buffer-size
  "returns: `long`"
  (^Long [^NativeRandom this]
    (-> this (.getBufferSize))))

(defn next-long
  "Description copied from interface: Random

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^NativeRandom this]
    (-> this (.nextLong))))

(defn get-generation
  "returns: `long`"
  (^Long [^NativeRandom this]
    (-> this (.getGeneration))))

(defn get-extra-pointers
  "returns: `org.bytedeco.javacpp.PointerPointer`"
  (^org.bytedeco.javacpp.PointerPointer [^NativeRandom this]
    (-> this (.getExtraPointers))))

(defn close
  "throws: java.lang.Exception"
  ([^NativeRandom this]
    (-> this (.close))))

(defn next-gaussian
  "Description copied from interface: Random

  order - the order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this ^Character order shape]
    (-> this (.nextGaussian order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this shape]
    (-> this (.nextGaussian shape)))
  (^Double [^NativeRandom this]
    (-> this (.nextGaussian))))

(defn init
  ""
  ([^NativeRandom this]
    (-> this (.init))))

(defn next-bytes
  "Description copied from interface: Random

  bytes - the non-null byte array in which to put therandom bytes - `byte[]`"
  ([^NativeRandom this bytes]
    (-> this (.nextBytes bytes))))

(defn get-seed
  "Description copied from interface: Random

  returns: the seed value - `long`"
  (^Long [^NativeRandom this]
    (-> this (.getSeed))))

(defn next-double
  "Description copied from interface: Random

  order - order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this ^Character order shape]
    (-> this (.nextDouble order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeRandom this shape]
    (-> this (.nextDouble shape)))
  (^Double [^NativeRandom this]
    (-> this (.nextDouble))))

(defn re-seed
  "Description copied from interface: Random

  amplifier - `long`"
  ([^NativeRandom this ^Long amplifier]
    (-> this (.reSeed amplifier)))
  ([^NativeRandom this]
    (-> this (.reSeed))))

(defn next-boolean
  "Description copied from interface: Random

  returns: the next pseudorandom, uniformly distributed
  boolean value from this random number generator's
  sequence - `boolean`"
  (^Boolean [^NativeRandom this]
    (-> this (.nextBoolean))))

(defn get-state-pointer
  "This method returns pointer to RNG state structure.
  Please note: DefaultRandom implementation returns NULL here, making it impossible to use with RandomOps

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeRandom this]
    (-> this (.getStatePointer))))

