(ns org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl EmnistDataSetIterator$Set]))

(def COMPLETE
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/COMPLETE)

(def MERGE
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/MERGE)

(def BALANCED
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/BALANCED)

(def LETTERS
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/LETTERS)

(def DIGITS
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/DIGITS)

(def MNIST
  "Enum Constant.

  type: org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set"
  EmnistDataSetIterator$Set/MNIST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (EmnistDataSetIterator.Set c : EmnistDataSetIterator.Set.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set[]`"
  ([]
    (EmnistDataSetIterator$Set/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set [^java.lang.String name]
    (EmnistDataSetIterator$Set/valueOf name)))

