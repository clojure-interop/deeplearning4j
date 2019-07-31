(ns org.datavec.api.transform.schema.InferredSchema
  "If passed a CSV file that contains a header and a single row of sample data, it will return
 a Schema.
 Only Double, Integer, Long, and String types are supported. If no number type can be inferred,
 the field type will become the default type. Note that if your column is actually categorical but
 is represented as a number, you will need to do additional transformation. Also, if your sample
 field is blank/null, it will also become the default type."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema InferredSchema]))

(defn ->inferred-schema
  "Constructor.

  path-to-csv - `java.lang.String`
  default-type - `org.datavec.api.transform.schema.InferredSchema.DataType`
  delimiter - `char`
  quote - `char`
  escape - `char`"
  (^InferredSchema [^java.lang.String path-to-csv ^org.datavec.api.transform.schema.InferredSchema.DataType default-type ^Character delimiter ^Character quote ^Character escape]
    (new InferredSchema path-to-csv default-type delimiter quote escape))
  (^InferredSchema [^java.lang.String path-to-csv ^org.datavec.api.transform.schema.InferredSchema.DataType default-type ^Character delimiter ^Character quote]
    (new InferredSchema path-to-csv default-type delimiter quote))
  (^InferredSchema [^java.lang.String path-to-csv ^org.datavec.api.transform.schema.InferredSchema.DataType default-type ^Character delimiter]
    (new InferredSchema path-to-csv default-type delimiter))
  (^InferredSchema [^java.lang.String path-to-csv ^org.datavec.api.transform.schema.InferredSchema.DataType default-type]
    (new InferredSchema path-to-csv default-type))
  (^InferredSchema [^java.lang.String path-to-csv]
    (new InferredSchema path-to-csv)))

(defn build
  "returns: `org.datavec.api.transform.schema.Schema`

  throws: java.io.IOException"
  (^org.datavec.api.transform.schema.Schema [^InferredSchema this]
    (-> this (.build))))

