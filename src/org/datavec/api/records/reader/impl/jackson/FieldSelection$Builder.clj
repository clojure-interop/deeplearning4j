(ns org.datavec.api.records.reader.impl.jackson.FieldSelection$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson FieldSelection$Builder]))

(defn ->builder
  "Constructor."
  (^FieldSelection$Builder []
    (new FieldSelection$Builder )))

(defn add-field
  "value-if-missing - `org.datavec.api.writable.Writable`
  field-path - `java.lang.String`

  returns: `org.datavec.api.records.reader.impl.jackson.FieldSelection$Builder`"
  (^org.datavec.api.records.reader.impl.jackson.FieldSelection$Builder [^FieldSelection$Builder this ^org.datavec.api.writable.Writable value-if-missing ^java.lang.String field-path]
    (-> this (.addField value-if-missing field-path)))
  (^org.datavec.api.records.reader.impl.jackson.FieldSelection$Builder [^FieldSelection$Builder this ^java.lang.String field-path]
    (-> this (.addField field-path))))

(defn build
  "returns: `org.datavec.api.records.reader.impl.jackson.FieldSelection`"
  (^org.datavec.api.records.reader.impl.jackson.FieldSelection [^FieldSelection$Builder this]
    (-> this (.build))))

