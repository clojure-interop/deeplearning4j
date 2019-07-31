(ns org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator RandomDataSetIterator$Values]))

(def RANDOM_UNIFORM
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/RANDOM_UNIFORM)

(def RANDOM_NORMAL
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/RANDOM_NORMAL)

(def ONE_HOT
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/ONE_HOT)

(def ZEROS
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/ZEROS)

(def ONES
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/ONES)

(def BINARY
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/BINARY)

(def INTEGER_0_10
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/INTEGER_0_10)

(def INTEGER_0_100
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/INTEGER_0_100)

(def INTEGER_0_1000
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/INTEGER_0_1000)

(def INTEGER_0_10000
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/INTEGER_0_10000)

(def INTEGER_0_100000
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values"
  RandomDataSetIterator$Values/INTEGER_0_100000)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RandomDataSetIterator.Values c : RandomDataSetIterator.Values.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values[]`"
  ([]
    (RandomDataSetIterator$Values/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values [^java.lang.String name]
    (RandomDataSetIterator$Values/valueOf name)))

(defn to-mds-values
  "returns: `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values`"
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values [^RandomDataSetIterator$Values this]
    (-> this (.toMdsValues))))

