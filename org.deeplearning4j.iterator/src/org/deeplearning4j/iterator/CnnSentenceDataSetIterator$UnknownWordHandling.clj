(ns org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator CnnSentenceDataSetIterator$UnknownWordHandling]))

(def RemoveWord
  "Enum Constant.

  type: org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling"
  CnnSentenceDataSetIterator$UnknownWordHandling/RemoveWord)

(def UseUnknownVector
  "Enum Constant.

  type: org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling"
  CnnSentenceDataSetIterator$UnknownWordHandling/UseUnknownVector)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CnnSentenceDataSetIterator.UnknownWordHandling c : CnnSentenceDataSetIterator.UnknownWordHandling.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling[]`"
  ([]
    (CnnSentenceDataSetIterator$UnknownWordHandling/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.iterator.CnnSentenceDataSetIterator$UnknownWordHandling [^java.lang.String name]
    (CnnSentenceDataSetIterator$UnknownWordHandling/valueOf name)))

