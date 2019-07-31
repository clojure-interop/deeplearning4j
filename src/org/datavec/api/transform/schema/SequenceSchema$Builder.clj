(ns org.datavec.api.transform.schema.SequenceSchema$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema SequenceSchema$Builder]))

(defn ->builder
  "Constructor."
  (^SequenceSchema$Builder []
    (new SequenceSchema$Builder )))

(defn min-sequence-length
  "min-sequence-length - `int`

  returns: `org.datavec.api.transform.schema.SequenceSchema$Builder`"
  (^org.datavec.api.transform.schema.SequenceSchema$Builder [^SequenceSchema$Builder this ^Integer min-sequence-length]
    (-> this (.minSequenceLength min-sequence-length))))

(defn max-sequence-length
  "max-sequence-length - `int`

  returns: `org.datavec.api.transform.schema.SequenceSchema$Builder`"
  (^org.datavec.api.transform.schema.SequenceSchema$Builder [^SequenceSchema$Builder this ^Integer max-sequence-length]
    (-> this (.maxSequenceLength max-sequence-length))))

(defn build
  "Description copied from class: Schema.Builder

  returns: `org.datavec.api.transform.schema.SequenceSchema`"
  (^org.datavec.api.transform.schema.SequenceSchema [^SequenceSchema$Builder this]
    (-> this (.build))))

