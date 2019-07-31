(ns org.nd4j.linalg.api.rng.DefaultRandom
  "Apache commons based random number generation
 Please note: this implementation can't be used for NativeOps execution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng DefaultRandom]))

(defn ->default-random
  "Constructor.

  Initialize with a System.currentTimeMillis()
  seed"
  (^DefaultRandom []
    (new DefaultRandom ))
  (^DefaultRandom [^Long seed]
    (new DefaultRandom seed)))

(defn get-state-buffer
  "This method returns pointer to RNG buffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DefaultRandom this]
    (-> this (.getStateBuffer))))

(defn set-seed
  "Description copied from interface: Random

  seed - the seed value - `int`"
  ([^DefaultRandom this ^Integer seed]
    (-> this (.setSeed seed))))

(defn next-float
  "Description copied from interface: Random

  order - `char`
  shape - `int[]`

  returns: the generated uniform numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this ^Character order shape]
    (-> this (.nextFloat order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this shape]
    (-> this (.nextFloat shape)))
  (^Float [^DefaultRandom this]
    (-> this (.nextFloat))))

(defn next-int
  "Description copied from interface: Random

  a - `int`
  n - `int`

  returns: a pseudorandom, uniformly distributed int
  value between 0 (inclusive) and n (exclusive). - `int`"
  (^Integer [^DefaultRandom this ^Integer a ^Integer n]
    (-> this (.nextInt a n)))
  (^Integer [^DefaultRandom this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^DefaultRandom this]
    (-> this (.nextInt))))

(defn next-long
  "Description copied from interface: Random

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^DefaultRandom this]
    (-> this (.nextLong))))

(defn close
  "throws: java.lang.Exception"
  ([^DefaultRandom this]
    (-> this (.close))))

(defn next-gaussian
  "Description copied from interface: Random

  order - the order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this ^Character order shape]
    (-> this (.nextGaussian order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this shape]
    (-> this (.nextGaussian shape)))
  (^Double [^DefaultRandom this]
    (-> this (.nextGaussian))))

(defn next-bytes
  "Description copied from interface: Random

  bytes - the non-null byte array in which to put therandom bytes - `byte[]`"
  ([^DefaultRandom this bytes]
    (-> this (.nextBytes bytes))))

(defn get-seed
  "Description copied from interface: Random

  returns: the seed value - `long`"
  (^Long [^DefaultRandom this]
    (-> this (.getSeed))))

(defn next-double
  "Description copied from interface: Random

  order - order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this ^Character order shape]
    (-> this (.nextDouble order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultRandom this shape]
    (-> this (.nextDouble shape)))
  (^Double [^DefaultRandom this]
    (-> this (.nextDouble))))

(defn re-seed
  "Identical to setSeed(seed);

  seed - `long`"
  ([^DefaultRandom this ^Long seed]
    (-> this (.reSeed seed)))
  ([^DefaultRandom this]
    (-> this (.reSeed))))

(defn next-boolean
  "Description copied from interface: Random

  returns: the next pseudorandom, uniformly distributed
  boolean value from this random number generator's
  sequence - `boolean`"
  (^Boolean [^DefaultRandom this]
    (-> this (.nextBoolean))))

(defn get-random-generator
  "returns: `org.apache.commons.math3.random.RandomGenerator`"
  (^org.apache.commons.math3.random.RandomGenerator [^DefaultRandom this]
    (-> this (.getRandomGenerator))))

(defn get-state-pointer
  "This method returns pointer to RNG state structure.
  Please note: DefaultRandom implementation returns NULL here, making it impossible to use with RandomOps

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^DefaultRandom this]
    (-> this (.getStatePointer))))

