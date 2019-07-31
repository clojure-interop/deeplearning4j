(ns org.datavec.api.transform.sequence.split.SplitMaxLengthSequence
  "Split a sequence into a number of smaller sequences of length 'maxSequenceLength'.
 If the sequence length is smaller than maxSequenceLength, the sequence is unchanged"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.split SplitMaxLengthSequence]))

(defn ->split-max-length-sequence
  "Constructor.

  max-sequence-length - max length of sequences - `int`
  equal-splits - if true: split larger sequences into equal sized subsequences. If false: split inton maxSequenceLength sequences, and (if necessary) 1 with 1 <= length < maxSequenceLength - `boolean`"
  (^SplitMaxLengthSequence [^Integer max-sequence-length ^Boolean equal-splits]
    (new SplitMaxLengthSequence max-sequence-length equal-splits)))

(defn split
  "Description copied from interface: SequenceSplit

  sequence - the sequence to split - `java.util.List`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^SplitMaxLengthSequence this ^java.util.List sequence]
    (-> this (.split sequence))))

(defn set-input-schema
  "Description copied from interface: SequenceSplit

  input-schema - the schema to set - `org.datavec.api.transform.schema.Schema`"
  ([^SplitMaxLengthSequence this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: SequenceSplit

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SplitMaxLengthSequence this]
    (-> this (.getInputSchema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SplitMaxLengthSequence this]
    (-> this (.toString))))

