(ns org.nd4j.linalg.api.rng.Random
  "Random generation based on commons math.
 This is mean to be an independent."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng Random]))

(defn get-state-buffer
  "This method returns pointer to RNG buffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Random this]
    (-> this (.getStateBuffer))))

(defn set-seed
  "Sets the seed of the underlying random number generator using an
  int seed.
  Sequences of values generated starting with the same seeds
  should be identical.

  seed - the seed value - `int`"
  ([^Random this ^Integer seed]
    (-> this (.setSeed seed))))

(defn next-float
  "Generate a uniform number ndarray
  of the specified shape

  order - `char`
  shape - the shape to generate - `int[]`

  returns: the generated uniform numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this ^Character order shape]
    (-> this (.nextFloat order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this shape]
    (-> this (.nextFloat shape)))
  (^Float [^Random this]
    (-> this (.nextFloat))))

(defn next-int
  "Returns a pseudorandom, uniformly distributed int value
  between 0 (inclusive) and the specified value (exclusive), drawn from
  this random number generator's sequence.

  a - `int`
  n - the bound on the random number to be returned. Must bepositive. - `int`

  returns: a pseudorandom, uniformly distributed int
  value between 0 (inclusive) and n (exclusive). - `int`

  throws: java.lang.IllegalArgumentException - if n is not positive."
  (^Integer [^Random this ^Integer a ^Integer n]
    (-> this (.nextInt a n)))
  (^Integer [^Random this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^Random this]
    (-> this (.nextInt))))

(defn next-long
  "Returns the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence. All
  264 possible long values
  should be produced with (approximately) equal probability.

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^Random this]
    (-> this (.nextLong))))

(defn next-gaussian
  "Generate a gaussian number ndarray
  of the specified shape and order

  order - the order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this ^Character order shape]
    (-> this (.nextGaussian order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this shape]
    (-> this (.nextGaussian shape)))
  (^Double [^Random this]
    (-> this (.nextGaussian))))

(defn next-bytes
  "Generates random bytes and places them into a user-supplied
  byte array. The number of random bytes produced is equal to
  the length of the byte array.

  bytes - the non-null byte array in which to put therandom bytes - `byte[]`"
  ([^Random this bytes]
    (-> this (.nextBytes bytes))))

(defn get-seed
  "Gets the long seed of the underlying
  random number generator.

  returns: the seed value - `long`"
  (^Long [^Random this]
    (-> this (.getSeed))))

(defn next-double
  "Generate a uniform number ndarray
  of the specified shape and order

  order - order of the output array - `char`
  shape - the shape to generate - `int[]`

  returns: the generated gaussian numbers - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this ^Character order shape]
    (-> this (.nextDouble order shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Random this shape]
    (-> this (.nextDouble shape)))
  (^Double [^Random this]
    (-> this (.nextDouble))))

(defn re-seed
  "This method is similar to setSeed() but it doesn't really touches underlying buffer, if any. So it acts as additional modifier to current RNG state.
  PLEASE NOTE: Never use this method unless you're 100% sure what it does and why you would need it.

  seed - `long`"
  ([^Random this ^Long seed]
    (-> this (.reSeed seed)))
  ([^Random this]
    (-> this (.reSeed))))

(defn next-boolean
  "Returns the next pseudorandom, uniformly distributed
  boolean value from this random number generator's
  sequence.

  returns: the next pseudorandom, uniformly distributed
  boolean value from this random number generator's
  sequence - `boolean`"
  (^Boolean [^Random this]
    (-> this (.nextBoolean))))

(defn get-state-pointer
  "This method returns pointer to RNG state structure.
  Please note: DefaultRandom implementation returns NULL here, making it impossible to use with RandomOps

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Random this]
    (-> this (.getStatePointer))))

