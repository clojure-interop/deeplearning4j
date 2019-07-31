(ns org.deeplearning4j.models.embeddings.learning.impl.elements.RandomUtils
  "RandomUtils is a wrapper that supports all possible
 Random methods via the Math.random()
 method and its system-wide Random object."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.learning.impl.elements RandomUtils]))

(defn ->random-utils
  "Constructor."
  (^RandomUtils []
    (new RandomUtils )))

(def *-jvm-random
  "Static Constant.

  type: java.util.Random"
  RandomUtils/JVM_RANDOM)

(defn *next-int
  "Returns a pseudorandom, uniformly distributed int value
  between 0 (inclusive) and the specified value
  (exclusive), from the given Random sequence.

  random - the Random sequence generator. - `java.util.Random`
  n - the specified exclusive max-value - `int`

  returns: the random int - `int`"
  (^Integer [^java.util.Random random ^Integer n]
    (RandomUtils/nextInt random n))
  (^Integer [^java.util.Random random]
    (RandomUtils/nextInt random))
  (^Integer []
    (RandomUtils/nextInt )))

(defn *next-long
  "Returns the next pseudorandom, uniformly distributed long value
  from the given Random sequence.

  random - the Random sequence generator. - `java.util.Random`

  returns: the random long - `long`"
  (^Long [^java.util.Random random]
    (RandomUtils/nextLong random))
  (^Long []
    (RandomUtils/nextLong )))

(defn *next-boolean
  "Returns the next pseudorandom, uniformly distributed boolean value
  from the given random sequence.

  random - the Random sequence generator. - `java.util.Random`

  returns: the random boolean - `boolean`"
  (^Boolean [^java.util.Random random]
    (RandomUtils/nextBoolean random))
  (^Boolean []
    (RandomUtils/nextBoolean )))

(defn *next-float
  "Returns the next pseudorandom, uniformly distributed float value
  between 0.0 and 1.0 from the given Random
  sequence.

  random - the Random sequence generator. - `java.util.Random`

  returns: the random float - `float`"
  (^Float [^java.util.Random random]
    (RandomUtils/nextFloat random))
  (^Float []
    (RandomUtils/nextFloat )))

(defn *next-double
  "Returns the next pseudorandom, uniformly distributed float value
  between 0.0 and 1.0 from the given Random
  sequence.

  random - the Random sequence generator. - `java.util.Random`

  returns: the random double - `double`"
  (^Double [^java.util.Random random]
    (RandomUtils/nextDouble random))
  (^Double []
    (RandomUtils/nextDouble )))

