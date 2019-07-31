(ns org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator CnnSentenceDataSetIterator$Format]))

(def RNN
  "Enum Constant.

  type: org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format"
  CnnSentenceDataSetIterator$Format/RNN)

(def CNN1D
  "Enum Constant.

  type: org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format"
  CnnSentenceDataSetIterator$Format/CNN1D)

(def CNN2D
  "Enum Constant.

  type: org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format"
  CnnSentenceDataSetIterator$Format/CNN2D)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CnnSentenceDataSetIterator.Format c : CnnSentenceDataSetIterator.Format.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format[]`"
  ([]
    (CnnSentenceDataSetIterator$Format/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$Format [^java.lang.String name]
    (CnnSentenceDataSetIterator$Format/valueOf name)))

