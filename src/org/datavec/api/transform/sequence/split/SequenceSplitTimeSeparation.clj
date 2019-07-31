(ns org.datavec.api.transform.sequence.split.SequenceSplitTimeSeparation
  "Split a sequence into multiple sequences, based on the separation of time steps in a time column.
 For example, suppose we have a sequence with a gap of 1 day between two blocks of entries: we can use
 SequenceSplitTimeSeparation to split this data into two separate sequences.
 More generally, split the sequence any time the separation between consecutive time steps exceeds a specified
 value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.split SequenceSplitTimeSeparation]))

(defn ->sequence-split-time-separation
  "Constructor.

  time-column - Time column to consider when splitting - `java.lang.String`
  time-quantity - Value/amount (of the specified TimeUnit) - `long`
  time-unit - The unit of time - `java.util.concurrent.TimeUnit`"
  (^SequenceSplitTimeSeparation [^java.lang.String time-column ^Long time-quantity ^java.util.concurrent.TimeUnit time-unit]
    (new SequenceSplitTimeSeparation time-column time-quantity time-unit)))

(defn split
  "Description copied from interface: SequenceSplit

  sequence - the sequence to split - `java.util.List`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^SequenceSplitTimeSeparation this ^java.util.List sequence]
    (-> this (.split sequence))))

(defn set-input-schema
  "Description copied from interface: SequenceSplit

  input-schema - the schema to set - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceSplitTimeSeparation this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: SequenceSplit

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceSplitTimeSeparation this]
    (-> this (.getInputSchema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceSplitTimeSeparation this]
    (-> this (.toString))))

