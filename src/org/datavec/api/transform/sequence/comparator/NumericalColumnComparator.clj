(ns org.datavec.api.transform.sequence.comparator.NumericalColumnComparator
  "Sequence comparator: compare elements in a sequence using the values in a single column
 Can be applied on any numerical column (Integer, Long, Double or Time columns)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.comparator NumericalColumnComparator]))

(defn ->numerical-column-comparator
  "Constructor.

  column-name - `java.lang.String`
  ascending - `boolean`"
  (^NumericalColumnComparator [^java.lang.String column-name ^Boolean ascending]
    (new NumericalColumnComparator column-name ascending))
  (^NumericalColumnComparator [^java.lang.String column-name]
    (new NumericalColumnComparator column-name)))

(defn set-schema
  "sequence-schema - `org.datavec.api.transform.schema.Schema`"
  ([^NumericalColumnComparator this ^org.datavec.api.transform.schema.Schema sequence-schema]
    (-> this (.setSchema sequence-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NumericalColumnComparator this]
    (-> this (.toString))))

