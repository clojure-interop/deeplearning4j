(ns org.datavec.api.transform.schema.SequenceSchema
  "A SequenceSchema is a Schema for sequential data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema SequenceSchema]))

(defn ->sequence-schema
  "Constructor.

  column-meta-data - `java.util.List`
  min-sequence-length - `java.lang.Integer`
  max-sequence-length - `java.lang.Integer`"
  (^SequenceSchema [^java.util.List column-meta-data ^java.lang.Integer min-sequence-length ^java.lang.Integer max-sequence-length]
    (new SequenceSchema column-meta-data min-sequence-length max-sequence-length))
  (^SequenceSchema [^java.util.List column-meta-data]
    (new SequenceSchema column-meta-data)))

(defn *infer-sequence-multi
  "Infers a sequence schema based
  on the record

  record - the record to infer the schema based on - `java.util.List`

  returns: the inferred sequence schema - `org.datavec.api.transform.schema.SequenceSchema`"
  (^org.datavec.api.transform.schema.SequenceSchema [^java.util.List record]
    (SequenceSchema/inferSequenceMulti record)))

(defn *infer-sequence
  "Infers a sequence schema based
  on the record

  record - the record to infer the schema based on - `java.util.List`

  returns: the inferred sequence schema - `org.datavec.api.transform.schema.SequenceSchema`"
  (^org.datavec.api.transform.schema.SequenceSchema [^java.util.List record]
    (SequenceSchema/inferSequence record)))

(defn new-schema
  "Description copied from class: Schema

  column-meta-data - the new metadata to create theschema from - `java.util.List`

  returns: the new schema - `org.datavec.api.transform.schema.SequenceSchema`"
  (^org.datavec.api.transform.schema.SequenceSchema [^SequenceSchema this ^java.util.List column-meta-data]
    (-> this (.newSchema column-meta-data))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceSchema this]
    (-> this (.toString))))

