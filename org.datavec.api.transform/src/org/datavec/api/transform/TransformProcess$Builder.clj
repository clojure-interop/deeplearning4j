(ns org.datavec.api.transform.TransformProcess$Builder
  "Builder class for constructing a TransformProcess"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform TransformProcess$Builder]))

(defn ->builder
  "Constructor.

  initial-schema - `org.datavec.api.transform.schema.Schema`"
  (^TransformProcess$Builder [^org.datavec.api.transform.schema.Schema initial-schema]
    (new TransformProcess$Builder initial-schema)))

(defn nd-array-scalar-op-transform
  "Element-wise NDArray math operation (add, subtract, etc) on an NDArray column

  column-name - Name of the NDArray column to perform the operation on - `java.lang.String`
  op - Operation to perform - `org.datavec.api.transform.MathOp`
  value - Value for the operation - `double`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathOp op ^Double value]
    (-> this (.ndArrayScalarOpTransform column-name op value))))

(defn integer-to-categorical
  "Convert the specified column from an integer representation (assume values 0 to numCategories-1) to
  a categorical representation, given the specified state names

  column-name - Name of the column to convert - `java.lang.String`
  category-state-names - Names of the states for the categorical column - `java.util.List`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^java.util.List category-state-names]
    (-> this (.integerToCategorical column-name category-state-names))))

(defn duplicate-columns
  "Duplicate a set of columns

  column-names - Names of the columns to duplicate - `java.util.List`
  new-names - Names of the new (duplicated) columns - `java.util.List`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.util.List column-names ^java.util.List new-names]
    (-> this (.duplicateColumns column-names new-names))))

(defn long-math-op
  "Perform a mathematical operation (add, subtract, scalar max etc) on the specified long column, with a scalar

  column-name - The long column to perform the operation on - `java.lang.String`
  math-op - The mathematical operation - `org.datavec.api.transform.MathOp`
  scalar - The scalar value to use in the mathematical operation - `long`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Long scalar]
    (-> this (.longMathOp column-name math-op scalar))))

(defn normalize
  "Normalize the specified column with a given type of normalization

  column - Column to normalize - `java.lang.String`
  type - Type of normalization to apply - `org.datavec.api.transform.transform.normalize.Normalize`
  da - DataAnalysis object - `org.datavec.api.transform.analysis.DataAnalysis`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^org.datavec.api.transform.transform.normalize.Normalize type ^org.datavec.api.transform.analysis.DataAnalysis da]
    (-> this (.normalize column type da))))

(defn integer-math-op
  "Perform a mathematical operation (add, subtract, scalar max etc) on the specified integer column, with a scalar

  column - The integer column to perform the operation on - `java.lang.String`
  math-op - The mathematical operation - `org.datavec.api.transform.MathOp`
  scalar - The scalar value to use in the mathematical operation - `int`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^org.datavec.api.transform.MathOp math-op ^Integer scalar]
    (-> this (.integerMathOp column math-op scalar))))

(defn add-constant-integer-column
  "Add a new integer column, where th
  e value for that column (for all records) are identical

  new-column-name - Name of the new column - `java.lang.String`
  value - Value of the new column for all records - `int`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^Integer value]
    (-> this (.addConstantIntegerColumn new-column-name value))))

(defn conditional-replace-value-transform
  "Replace the values in a specified column with a specified new value, if some condition holds.
  If the condition does not hold, the original values are not modified.

  column - Column to operate on - `java.lang.String`
  new-value - Value to use as replacement, if condition is satisfied - `org.datavec.api.writable.Writable`
  condition - Condition that must be satisfied for replacement - `org.datavec.api.transform.condition.Condition`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^org.datavec.api.writable.Writable new-value ^org.datavec.api.transform.condition.Condition condition]
    (-> this (.conditionalReplaceValueTransform column new-value condition))))

(defn categorical-to-integer
  "Convert the specified column(s) from a categorical representation to an integer representation.
  This will replace the specified categorical column(s) with an integer repreesentation, where
  each integer has the value 0 to numCategories-1.

  column-names - Name of the categorical column(s) to convert to an integer representation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-names]
    (-> this (.categoricalToInteger column-names))))

(defn add-constant-double-column
  "Add a new double column, where the value for that column (for all records) are identical

  new-column-name - Name of the new column - `java.lang.String`
  value - Value in the new column for all records - `double`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^Double value]
    (-> this (.addConstantDoubleColumn new-column-name value))))

(defn split-sequence
  "Split sequences into 1 or more other sequences. Used for example to split large sequences into a set of smaller sequences

  split - SequenceSplit that defines how splits will occur - `org.datavec.api.transform.sequence.SequenceSplit`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.sequence.SequenceSplit split]
    (-> this (.splitSequence split))))

(defn float-math-op
  "Perform a mathematical operation (add, subtract, scalar max etc) on the specified double column, with a scalar

  column-name - The float column to perform the operation on - `java.lang.String`
  math-op - The mathematical operation - `org.datavec.api.transform.MathOp`
  scalar - The scalar value to use in the mathematical operation - `float`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Float scalar]
    (-> this (.floatMathOp column-name math-op scalar))))

(defn convert-to-sequence
  "Convert a set of independent records/examples into a sequence, according to some key.
  Within each sequence, values are ordered using the provided SequenceComparator

  key-column - Column to use as a key (values with the same key will be combined into sequences) - `java.lang.String`
  comparator - A SequenceComparator to order the values within each sequence (for example, by time or String order) - `org.datavec.api.transform.sequence.SequenceComparator`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String key-column ^org.datavec.api.transform.sequence.SequenceComparator comparator]
    (-> this (.convertToSequence key-column comparator)))
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this]
    (-> this (.convertToSequence))))

(defn convert-to-double
  "Convert the specified column to a double.

  input-column - the input column to convert - `java.lang.String`

  returns: builder pattern - `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String input-column]
    (-> this (.convertToDouble input-column))))

(defn reduce-sequence
  "Reduce (i.e., aggregate/combine) a set of sequence examples - for each sequence individually.
  Note: This method results in non-sequence data. If you would instead prefer sequences of length 1
  after the reduction, use transform(new ReduceSequenceTransform(reducer)).

  reducer - Reducer to use to reduce each window - `org.datavec.api.transform.reduce.IAssociativeReducer`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.reduce.IAssociativeReducer reducer]
    (-> this (.reduceSequence reducer))))

(defn transform
  "Add a transformation to be executed after the previously-added operations have been executed

  transform - Transform to execute - `org.datavec.api.transform.Transform`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.Transform transform]
    (-> this (.transform transform))))

(defn string-to-time-transform
  "Convert a String column (containing a date/time String) to a time column (by parsing the date/time String)

  column - String column containing the date/time Strings - `java.lang.String`
  format - Format of the strings. Time format is specified as per http://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html - `java.lang.String`
  date-time-zone - Timezone of the column - `org.joda.time.DateTimeZone`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^java.lang.String format ^org.joda.time.DateTimeZone date-time-zone]
    (-> this (.stringToTimeTransform column format date-time-zone))))

(defn rename-columns
  "Rename multiple columns

  old-names - List of original column names - `java.util.List`
  new-names - List of new column names - `java.util.List`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.util.List old-names ^java.util.List new-names]
    (-> this (.renameColumns old-names new-names))))

(defn double-math-function
  "Perform a mathematical operation (such as sin(x), ceil(x), exp(x) etc) on a column

  column-name - Column name to operate on - `java.lang.String`
  math-function - MathFunction to apply to the column - `org.datavec.api.transform.MathFunction`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (-> this (.doubleMathFunction column-name math-function))))

(defn trim-sequence
  "SequenceTrimTranform removes the first or last N values in a sequence. Note that the resulting sequence
  may be of length 0, if the input sequence is less than or equal to N.

  num-steps-to-trim - Number of time steps to trim from the sequence - `int`
  trim-from-start - If true: Trim values from the start of the sequence. If false: trim values from the end. - `boolean`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^Integer num-steps-to-trim ^Boolean trim-from-start]
    (-> this (.trimSequence num-steps-to-trim trim-from-start))))

(defn double-math-op
  "Perform a mathematical operation (add, subtract, scalar max etc) on the specified double column, with a scalar

  column-name - The double column to perform the operation on - `java.lang.String`
  math-op - The mathematical operation - `org.datavec.api.transform.MathOp`
  scalar - The scalar value to use in the mathematical operation - `double`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Double scalar]
    (-> this (.doubleMathOp column-name math-op scalar))))

(defn nd-array-distance-transform
  "Calculate a distance (cosine similarity, Euclidean, Manhattan) on two equal-sized NDArray columns. This
  operation adds a new Double column (with the specified name) with the result.

  new-column-name - Name of the new column (result) to add - `java.lang.String`
  distance - Distance to apply - `org.datavec.api.transform.Distance`
  first-col - first column to use in the distance calculation - `java.lang.String`
  second-col - second column to use in the distance calculation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.Distance distance ^java.lang.String first-col ^java.lang.String second-col]
    (-> this (.ndArrayDistanceTransform new-column-name distance first-col second-col))))

(defn integer-columns-math-op
  "Calculate and add a new integer column by performing a mathematical operation on a number of existing columns.
  New column is added to the end.

  new-column-name - Name of the new/derived column - `java.lang.String`
  math-op - Mathematical operation to execute on the columns - `org.datavec.api.transform.MathOp`
  column-names - Names of the columns to use in the mathematical operation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String column-names]
    (-> this (.integerColumnsMathOp new-column-name math-op column-names))))

(defn double-columns-math-op
  "Calculate and add a new double column by performing a mathematical operation on a number of existing columns.
  New column is added to the end.

  new-column-name - Name of the new/derived column - `java.lang.String`
  math-op - Mathematical operation to execute on the columns - `org.datavec.api.transform.MathOp`
  column-names - Names of the columns to use in the mathematical operation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String column-names]
    (-> this (.doubleColumnsMathOp new-column-name math-op column-names))))

(defn convert-to-string
  "Convert the specified column to a string.

  input-column - the input column to convert - `java.lang.String`

  returns: builder pattern - `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String input-column]
    (-> this (.convertToString input-column))))

(defn add-constant-long-column
  "Add a new integer column, where the value for that column (for all records) are identical

  new-column-name - Name of the new column - `java.lang.String`
  value - Value in the new column for all records - `long`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^Long value]
    (-> this (.addConstantLongColumn new-column-name value))))

(defn conditional-replace-value-transform-with-default
  "Replace the values in a specified column with a specified \"yes\" value, if some condition holds.
  Replace it with a \"no\" value, otherwise.

  column - Column to operate on - `java.lang.String`
  yes-val - Value to use as replacement, if condition is satisfied - `org.datavec.api.writable.Writable`
  no-val - Value to use as replacement, if condition is not satisfied - `org.datavec.api.writable.Writable`
  condition - Condition that must be satisfied for replacement - `org.datavec.api.transform.condition.Condition`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^org.datavec.api.writable.Writable yes-val ^org.datavec.api.writable.Writable no-val ^org.datavec.api.transform.condition.Condition condition]
    (-> this (.conditionalReplaceValueTransformWithDefault column yes-val no-val condition))))

(defn build
  "Create the TransformProcess object

  returns: `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^TransformProcess$Builder this]
    (-> this (.build))))

(defn remove-columns
  "Remove all of the specified columns, by name

  column-names - Names of the columns to remove - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-names]
    (-> this (.removeColumns column-names))))

(defn reorder-columns
  "Reorder the columns using a partial or complete new ordering.
  If only some of the column names are specified for the new order, the remaining columns will be placed at
  the end, according to their current relative ordering

  new-order - Names of the columns, in the order they will appear in the output - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-order]
    (-> this (.reorderColumns new-order))))

(defn remove-all-columns-except-for
  "Remove all columns, except for those that are specified here

  column-names - Names of the columns to keep - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-names]
    (-> this (.removeAllColumnsExceptFor column-names))))

(defn append-string-column-transform
  "Append a String to a specified column

  column - Column to append the value to - `java.lang.String`
  to-append - String to append to the end of each writable - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^java.lang.String to-append]
    (-> this (.appendStringColumnTransform column to-append))))

(defn convert-to-integer
  "Convert the specified column to an integer.

  input-column - the input column to convert - `java.lang.String`

  returns: builder pattern - `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String input-column]
    (-> this (.convertToInteger input-column))))

(defn conditional-copy-value-transform
  "Replace the value in a specified column with a new value taken from another column, if a condition is satisfied/true.
  Note that the condition can be any generic condition, including on other column(s), different to the column
  that will be modified if the condition is satisfied/true.

  column-to-replace - Name of the column in which values will be replaced (if condition is satisfied) - `java.lang.String`
  source-column - Name of the column from which the new values will be - `java.lang.String`
  condition - Condition to use - `org.datavec.api.transform.condition.Condition`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-to-replace ^java.lang.String source-column ^org.datavec.api.transform.condition.Condition condition]
    (-> this (.conditionalCopyValueTransform column-to-replace source-column condition))))

(defn filter
  "Add a filter operation to be executed after the previously-added operations have been executed

  filter - Filter operation to execute - `org.datavec.api.transform.filter.Filter`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.filter.Filter filter]
    (-> this (.filter filter))))

(defn nd-array-math-function-transform
  "Apply an element wise mathematical function (sin, tanh, abs etc) to an NDArray column. This operation is
  performed in place.

  column-name - Name of the column to perform the operation on - `java.lang.String`
  math-function - Mathematical function to apply - `org.datavec.api.transform.MathFunction`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (-> this (.ndArrayMathFunctionTransform column-name math-function))))

(defn float-math-function
  "Perform a mathematical operation (such as sin(x), ceil(x), exp(x) etc) on a column

  column-name - Column name to operate on - `java.lang.String`
  math-function - MathFunction to apply to the column - `org.datavec.api.transform.MathFunction`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathFunction math-function]
    (-> this (.floatMathFunction column-name math-function))))

(defn offset-sequence
  "Perform a sequence of operation on the specified columns. Note that this also truncates sequences by the
  specified offset amount by default. Use transform(new SequenceOffsetTransform(...) to change this.
  See SequenceOffsetTransform for details on exactly what this operation does and how.

  columns-to-offset - Columns to offset - `java.util.List`
  offset-amount - Amount to offset the specified columns by (positive offset: 'columnsToOffset' aremoved to later time steps) - `int`
  operation-type - Whether the offset should be done in-place or by adding a new column - `org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.util.List columns-to-offset ^Integer offset-amount ^org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType operation-type]
    (-> this (.offsetSequence columns-to-offset offset-amount operation-type))))

(defn integer-to-one-hot
  "Convert an integer column to a set of 1 hot columns, based on the value in integer column

  column-name - Name of the integer column - `java.lang.String`
  min-value - Minimum value possible for the integer column (inclusive) - `int`
  max-value - Maximum value possible for the integer column (inclusive) - `int`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^Integer min-value ^Integer max-value]
    (-> this (.integerToOneHot column-name min-value max-value))))

(defn string-map-transform
  "Replace one or more String values in the specified column with new values.

  Keys in the map are the original values; the Values in the map are their replacements.
  If a String appears in the data but does not appear in the provided map (as a key), that String values will
  not be modified.

  column-name - Name of the column in which to do replacement - `java.lang.String`
  mapping - Map of oldValues -> newValues - `java.util.Map`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^java.util.Map mapping]
    (-> this (.stringMapTransform column-name mapping))))

(defn long-columns-math-op
  "Calculate and add a new long column by performing a mathematical operation on a number of existing columns.
  New column is added to the end.

  new-column-name - Name of the new/derived column - `java.lang.String`
  math-op - Mathematical operation to execute on the columns - `org.datavec.api.transform.MathOp`
  column-names - Names of the columns to use in the mathematical operation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String column-names]
    (-> this (.longColumnsMathOp new-column-name math-op column-names))))

(defn convert-from-sequence
  "Convert a sequence to a set of individual values (by treating each value in each sequence as a separate example)

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this]
    (-> this (.convertFromSequence))))

(defn sequence-moving-window-reduce
  "SequenceMovingWindowReduceTransform: Adds a new column, where the value is derived by:
  (a) using a window of the last N values in a single column,
  (b) Apply a reduction op on the window to calculate a new value
  for example, this transformer can be used to implement a simple moving average of the last N values,
  or determine the minimum or maximum values in the last N time steps.

  For example, for a simple moving average, length 20: new SequenceMovingWindowReduceTransform(\"myCol\", 20, ReduceOp.Mean)

  column-name - Column name to perform windowing on - `java.lang.String`
  lookback - Look back period for windowing - `int`
  op - Reduction operation to perform on each window - `org.datavec.api.transform.ReduceOp`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^Integer lookback ^org.datavec.api.transform.ReduceOp op]
    (-> this (.sequenceMovingWindowReduce column-name lookback op))))

(defn string-remove-whitespace-transform
  "Remove all whitespace characters from the values in the specified String column

  column-name - Name of the column to remove whitespace from - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name]
    (-> this (.stringRemoveWhitespaceTransform column-name))))

(defn duplicate-column
  "Duplicate a single column

  column - Name of the column to duplicate - `java.lang.String`
  new-name - Name of the new (duplicate) column - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column ^java.lang.String new-name]
    (-> this (.duplicateColumn column new-name))))

(defn reduce
  "Reduce (i.e., aggregate/combine) a set of examples (typically by key).
  Note: In the current implementation, reduction operations can be performed only on standard (i.e., non-sequence) data

  reducer - Reducer to use - `org.datavec.api.transform.reduce.IAssociativeReducer`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.reduce.IAssociativeReducer reducer]
    (-> this (.reduce reducer))))

(defn nd-array-columns-math-op-transform
  "Perform an element wise mathematical operation (such as add, subtract, multiply) on NDArray columns.
  The existing columns are unchanged, a new NDArray column is added

  new-column-name - Name of the new NDArray column - `java.lang.String`
  math-op - Operation to perform - `org.datavec.api.transform.MathOp`
  column-names - Name of the columns used as input to the operation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String column-names]
    (-> this (.ndArrayColumnsMathOpTransform new-column-name math-op column-names))))

(defn string-to-categorical
  "Convert the specified String column to a categorical column. The state names must be provided.

  column-name - Name of the String column to convert to categorical - `java.lang.String`
  state-names - State names of the category - `java.util.List`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^java.util.List state-names]
    (-> this (.stringToCategorical column-name state-names))))

(defn reduce-sequence-by-window
  "Reduce (i.e., aggregate/combine) a set of sequence examples - for each sequence individually - using a window function.
  For example, take all records/examples in each 24-hour period (i.e., using window function), and convert them into
  a singe value (using the reducer). In this example, the output is a sequence, with time period of 24 hours.

  reducer - Reducer to use to reduce each window - `org.datavec.api.transform.reduce.IAssociativeReducer`
  window-function - Window function to find apply on each sequence individually - `org.datavec.api.transform.sequence.window.WindowFunction`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^org.datavec.api.transform.reduce.IAssociativeReducer reducer ^org.datavec.api.transform.sequence.window.WindowFunction window-function]
    (-> this (.reduceSequenceByWindow reducer window-function))))

(defn rename-column
  "Rename a single column

  old-name - Original column name - `java.lang.String`
  new-name - New column name - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String old-name ^java.lang.String new-name]
    (-> this (.renameColumn old-name new-name))))

(defn float-columns-math-op
  "Calculate and add a new float column by performing a mathematical operation on a number of existing columns.
  New column is added to the end.

  new-column-name - Name of the new/derived column - `java.lang.String`
  math-op - Mathematical operation to execute on the columns - `org.datavec.api.transform.MathOp`
  column-names - Names of the columns to use in the mathematical operation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String column-names]
    (-> this (.floatColumnsMathOp new-column-name math-op column-names))))

(defn calculate-sorted-rank
  "CalculateSortedRank: calculate the rank of each example, after sorting example.
  For example, we might have some numerical \"score\" column, and we want to know for the rank (sort order) for each
  example, according to that column.
  The rank of each example (after sorting) will be added in a new Long column. Indexing is done from 0; examples will have
  values 0 to dataSetSize-1.

  Currently, CalculateSortedRank can only be applied on standard (i.e., non-sequence) data
  Furthermore, the current implementation can only sort on one column

  new-column-name - Name of the new column (will contain the rank for each example) - `java.lang.String`
  sort-on-column - Column to sort on - `java.lang.String`
  comparator - Comparator used to sort examples - `org.datavec.api.writable.comparator.WritableComparator`
  ascending - If true: sort ascending. False: descending - `boolean`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^java.lang.String sort-on-column ^org.datavec.api.writable.comparator.WritableComparator comparator ^Boolean ascending]
    (-> this (.calculateSortedRank new-column-name sort-on-column comparator ascending)))
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^java.lang.String sort-on-column ^org.datavec.api.writable.comparator.WritableComparator comparator]
    (-> this (.calculateSortedRank new-column-name sort-on-column comparator))))

(defn replace-string-transform
  "Replace one or more String values in the specified column that match regular expressions.

  Keys in the map are the regular expressions; the Values in the map are their String replacements.
  For example:



  Original
  Regex
  Replacement
  Result


  Data_Vec
  _

  DataVec


  B1C2T3
  \\\\d
  one
  BoneConeTone


  ' &nbsp4.25 '
  ^\\\\s+|\\\\s+$

  '4.25'

  column-name - Name of the column in which to do replacement - `java.lang.String`
  mapping - Map of old values or regular expression to new values - `java.util.Map`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^java.util.Map mapping]
    (-> this (.replaceStringTransform column-name mapping))))

(defn add-constant-column
  "Add a new column, where all values in the column are identical and as specified.

  new-column-name - Name of the new column - `java.lang.String`
  new-column-type - Type of the new column - `org.datavec.api.transform.ColumnType`
  fixed-value - Value in the new column for all records - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String new-column-name ^org.datavec.api.transform.ColumnType new-column-type ^org.datavec.api.writable.Writable fixed-value]
    (-> this (.addConstantColumn new-column-name new-column-type fixed-value))))

(defn categorical-to-one-hot
  "Convert the specified column(s) from a categorical representation to a one-hot representation.
  This involves the creation of multiple new columns each.

  column-names - Names of the categorical column(s) to convert to a one-hot representation - `java.lang.String`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-names]
    (-> this (.categoricalToOneHot column-names))))

(defn time-math-op
  "Perform a mathematical operation (add, subtract, scalar min/max only) on the specified time column

  column-name - The integer column to perform the operation on - `java.lang.String`
  math-op - The mathematical operation - `org.datavec.api.transform.MathOp`
  time-quantity - The quantity used in the mathematical op - `long`
  time-unit - The unit that timeQuantity is specified in - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.TransformProcess$Builder`"
  (^org.datavec.api.transform.TransformProcess$Builder [^TransformProcess$Builder this ^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Long time-quantity ^java.util.concurrent.TimeUnit time-unit]
    (-> this (.timeMathOp column-name math-op time-quantity time-unit))))

