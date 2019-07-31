(ns org.datavec.api.transform.sequence.ConvertToSequence
  "Convert a set of values to a sequence. Two approaches are supported:
 (a) if \"singleStepsequenceMode\" is true - convert each record independently, to a \"sequence\" of length 1
 (b) otherwise - performa \"group and sort\" operations. For example, group by one or more columns, and then
 sort each value within the group by some mechanism. For example, group by customer, sort by time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence ConvertToSequence]))

(defn ->convert-to-sequence
  "Constructor.

  single-step-sequences-mode - `boolean`
  key-columns - The value or values to use as the key (multiple values: compound key) for inferring whichexamples belong to what sequence - `java.lang.String[]`
  comparator - The comparator to use when deciding the order of each possible time step in the sequence - `org.datavec.api.transform.sequence.SequenceComparator`"
  (^ConvertToSequence [^Boolean single-step-sequences-mode key-columns ^org.datavec.api.transform.sequence.SequenceComparator comparator]
    (new ConvertToSequence single-step-sequences-mode key-columns comparator))
  (^ConvertToSequence [^java.lang.String key-column ^org.datavec.api.transform.sequence.SequenceComparator comparator]
    (new ConvertToSequence key-column comparator)))

(defn transform
  "schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.SequenceSchema`"
  (^org.datavec.api.transform.schema.SequenceSchema [^ConvertToSequence this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^ConvertToSequence this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConvertToSequence this]
    (-> this (.toString))))

