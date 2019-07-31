(ns org.datavec.api.transform.schema.Schema$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema Schema$Builder]))

(defn ->builder
  "Constructor."
  (^Schema$Builder []
    (new Schema$Builder )))

(defn add-columns-string
  "A convenience method for adding multiple numbered String columns.
  For example, to add columns \"myStringCol_0\", \"myStringCol_1\", \"myStringCol_2\", use
  addColumnsString(\"myStringCol_%d\",0,2)

  pattern - Pattern to use (via String.format). \"%d\" is replaced with column numbers - `java.lang.String`
  min-idx-inclusive - Minimum column index to use (inclusive) - `int`
  max-idx-inclusive - Maximum column index to use (inclusive) - `int`
  regex - Regex that the String must match in order to be considered valid. If null: no regex restriction - `java.lang.String`
  min-allowed-length - Minimum allowed length of strings (inclusive). If null: no restriction - `java.lang.Integer`
  max-allowed-length - Maximum allowed length of strings (inclusive). If null: no restriction - `java.lang.Integer`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive ^java.lang.String regex ^java.lang.Integer min-allowed-length ^java.lang.Integer max-allowed-length]
    (-> this (.addColumnsString pattern min-idx-inclusive max-idx-inclusive regex min-allowed-length max-allowed-length)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (-> this (.addColumnsString pattern min-idx-inclusive max-idx-inclusive)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-names]
    (-> this (.addColumnsString column-names))))

(defn add-columns-long
  "A convenience method for adding multiple Long columns.
  For example, to add columns \"myLongCol_0\", \"myLongCol_1\", \"myLongCol_2\", use
  addColumnsLong(\"myLongCol_%d\",0,2)

  pattern - Pattern to use (via String.format). \"%d\" is replaced with column numbers - `java.lang.String`
  min-idx-inclusive - Minimum column index to use (inclusive) - `int`
  max-idx-inclusive - Maximum column index to use (inclusive) - `int`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Long`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Long`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive ^java.lang.Long min-allowed-value ^java.lang.Long max-allowed-value]
    (-> this (.addColumnsLong pattern min-idx-inclusive max-idx-inclusive min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (-> this (.addColumnsLong pattern min-idx-inclusive max-idx-inclusive)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String names]
    (-> this (.addColumnsLong names))))

(defn add-column-categorical
  "Add a Categorical column, with the specified state names

  name - Name of the column - `java.lang.String`
  state-names - Names of the allowable states for this categorical column - `java.lang.String`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.String state-names]
    (-> this (.addColumnCategorical name state-names))))

(defn add-column-float
  "Add a Float column with the specified restrictions

  name - Name of the column - `java.lang.String`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Float`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Float`
  allow-na-n - If false: don't allow NaN values. If true: allow. - `boolean`
  allow-infinite - If false: don't allow infinite values. If true: allow - `boolean`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Float min-allowed-value ^java.lang.Float max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (-> this (.addColumnFloat name min-allowed-value max-allowed-value allow-na-n allow-infinite)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Float min-allowed-value ^java.lang.Float max-allowed-value]
    (-> this (.addColumnFloat name min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name]
    (-> this (.addColumnFloat name))))

(defn add-column-string
  "Add a String column with the specified restrictions

  name - Name of the column - `java.lang.String`
  regex - Regex that the String must match in order to be considered valid. If null: no regex restriction - `java.lang.String`
  min-allowable-length - Minimum allowable length for the String to be considered valid - `java.lang.Integer`
  max-allowable-length - Maximum allowable length for the String to be considered valid - `java.lang.Integer`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.String regex ^java.lang.Integer min-allowable-length ^java.lang.Integer max-allowable-length]
    (-> this (.addColumnString name regex min-allowable-length max-allowable-length)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name]
    (-> this (.addColumnString name))))

(defn add-column-double
  "Add a Double column with the specified restrictions

  name - Name of the column - `java.lang.String`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Double`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Double`
  allow-na-n - If false: don't allow NaN values. If true: allow. - `boolean`
  allow-infinite - If false: don't allow infinite values. If true: allow - `boolean`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Double min-allowed-value ^java.lang.Double max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (-> this (.addColumnDouble name min-allowed-value max-allowed-value allow-na-n allow-infinite)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Double min-allowed-value ^java.lang.Double max-allowed-value]
    (-> this (.addColumnDouble name min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name]
    (-> this (.addColumnDouble name))))

(defn add-column-time
  "Add a Time column with the specified restrictions
  NOTE: Time columns are represented by LONG (epoch millisecond) values. For time values in human-readable formats,
  use String columns  StringToTimeTransform

  column-name - Name of the column - `java.lang.String`
  time-zone - Time zone of the time column - `org.joda.time.DateTimeZone`
  min-valid-value - Minumum allowable time (in milliseconds). May be null. - `java.lang.Long`
  max-valid-value - Maximum allowable time (in milliseconds). May be null. - `java.lang.Long`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-name ^org.joda.time.DateTimeZone time-zone ^java.lang.Long min-valid-value ^java.lang.Long max-valid-value]
    (-> this (.addColumnTime column-name time-zone min-valid-value max-valid-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-name ^java.util.TimeZone time-zone]
    (-> this (.addColumnTime column-name time-zone))))

(defn add-columns-double
  "A convenience method for adding multiple Double columns, with additional restrictions that apply to all columns
  For example, to add columns \"myDoubleCol_0\", \"myDoubleCol_1\", \"myDoubleCol_2\", use
  addColumnsDouble(\"myDoubleCol_%d\",0,2,null,null,false,false)

  pattern - Pattern to use (via String.format). \"%d\" is replaced with column numbers - `java.lang.String`
  min-idx-inclusive - Minimum column index to use (inclusive) - `int`
  max-idx-inclusive - Maximum column index to use (inclusive) - `int`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Double`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Double`
  allow-na-n - If false: don't allow NaN values. If true: allow. - `boolean`
  allow-infinite - If false: don't allow infinite values. If true: allow - `boolean`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive ^java.lang.Double min-allowed-value ^java.lang.Double max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (-> this (.addColumnsDouble pattern min-idx-inclusive max-idx-inclusive min-allowed-value max-allowed-value allow-na-n allow-infinite)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (-> this (.addColumnsDouble pattern min-idx-inclusive max-idx-inclusive)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-names]
    (-> this (.addColumnsDouble column-names))))

(defn add-column-long
  "Add a Long column with the specified min/max allowable values

  name - Name of the column - `java.lang.String`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Long`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Long`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Long min-allowed-value ^java.lang.Long max-allowed-value]
    (-> this (.addColumnLong name min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name]
    (-> this (.addColumnLong name))))

(defn add-columns-integer
  "A convenience method for adding multiple Integer columns.
  For example, to add columns \"myIntegerCol_0\", \"myIntegerCol_1\", \"myIntegerCol_2\", use
  addColumnsInteger(\"myIntegerCol_%d\",0,2)

  pattern - Pattern to use (via String.format). \"%d\" is replaced with column numbers - `java.lang.String`
  min-idx-inclusive - Minimum column index to use (inclusive) - `int`
  max-idx-inclusive - Maximum column index to use (inclusive) - `int`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Integer`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Integer`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive ^java.lang.Integer min-allowed-value ^java.lang.Integer max-allowed-value]
    (-> this (.addColumnsInteger pattern min-idx-inclusive max-idx-inclusive min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (-> this (.addColumnsInteger pattern min-idx-inclusive max-idx-inclusive)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String names]
    (-> this (.addColumnsInteger names))))

(defn add-column-integer
  "Add an Integer column with the specified min/max allowable values

  name - Name of the column - `java.lang.String`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Integer`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Integer`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name ^java.lang.Integer min-allowed-value ^java.lang.Integer max-allowed-value]
    (-> this (.addColumnInteger name min-allowed-value max-allowed-value)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String name]
    (-> this (.addColumnInteger name))))

(defn build
  "Create the Schema

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Schema$Builder this]
    (-> this (.build))))

(defn add-column
  "Add a column

  meta-data - metadata for this column - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (-> this (.addColumn meta-data))))

(defn add-columns-float
  "A convenience method for adding multiple Float columns, with additional restrictions that apply to all columns
  For example, to add columns \"myFloatCol_0\", \"myFloatCol_1\", \"myFloatCol_2\", use
  addColumnsFloat(\"myFloatCol_%d\",0,2,null,null,false,false)

  pattern - Pattern to use (via String.format). \"%d\" is replaced with column numbers - `java.lang.String`
  min-idx-inclusive - Minimum column index to use (inclusive) - `int`
  max-idx-inclusive - Maximum column index to use (inclusive) - `int`
  min-allowed-value - Minimum allowed value (inclusive). If null: no restriction - `java.lang.Float`
  max-allowed-value - Maximum allowed value (inclusive). If null: no restriction - `java.lang.Float`
  allow-na-n - If false: don't allow NaN values. If true: allow. - `boolean`
  allow-infinite - If false: don't allow infinite values. If true: allow - `boolean`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive ^java.lang.Float min-allowed-value ^java.lang.Float max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (-> this (.addColumnsFloat pattern min-idx-inclusive max-idx-inclusive min-allowed-value max-allowed-value allow-na-n allow-infinite)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String pattern ^Integer min-idx-inclusive ^Integer max-idx-inclusive]
    (-> this (.addColumnsFloat pattern min-idx-inclusive max-idx-inclusive)))
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-names]
    (-> this (.addColumnsFloat column-names))))

(defn add-column-nd-array
  "Add a NDArray column

  column-name - Name of the column - `java.lang.String`
  shape - shape of the NDArray column. Use -1 in entries to specify as \"variable length\" in that dimension - `long[]`

  returns: `org.datavec.api.transform.schema.Schema$Builder`"
  (^org.datavec.api.transform.schema.Schema$Builder [^Schema$Builder this ^java.lang.String column-name shape]
    (-> this (.addColumnNDArray column-name shape))))

