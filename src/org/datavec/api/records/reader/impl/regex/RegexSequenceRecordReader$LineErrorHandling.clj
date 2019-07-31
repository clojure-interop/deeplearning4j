(ns org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.regex RegexSequenceRecordReader$LineErrorHandling]))

(def FailOnInvalid
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling"
  RegexSequenceRecordReader$LineErrorHandling/FailOnInvalid)

(def SkipInvalid
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling"
  RegexSequenceRecordReader$LineErrorHandling/SkipInvalid)

(def SkipInvalidWithWarning
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling"
  RegexSequenceRecordReader$LineErrorHandling/SkipInvalidWithWarning)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RegexSequenceRecordReader.LineErrorHandling c : RegexSequenceRecordReader.LineErrorHandling.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling[]`"
  ([]
    (RegexSequenceRecordReader$LineErrorHandling/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling [^java.lang.String name]
    (RegexSequenceRecordReader$LineErrorHandling/valueOf name)))

