(ns org.nd4j.autodiff.samediff.SameDiff
  "SameDiff is the
 entrypoint for
 nd4j's autodiff.

 You define a graph symbolically.

 That graph accumulates operations.

 In order to execute the graph, you run
 exec() to get all the operations
 exec(List) for an already created set of ops
 execAndEndResult() for the end result only
 execAndEndResult(List) for a cached set of ops"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SameDiff]))

(defn *get-data-type-as-byte
  "This method converts enums for DataType

  type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `byte`"
  (^Byte [^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (SameDiff/getDataTypeAsByte type)))

(defn *get-type-from-byte
  "This method converts enums for Op.Type

  type - Byte representing the op type - `byte`

  returns: Op type - `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Byte type]
    (SameDiff/getTypeFromByte type)))

(defn *permute-data-format-for-same-diff
  "Permute indices for the samediff/dl4j format.
  Due to the dl4j format being NCHW, this is a
  simple routine for returning permute indices.
  This is typically used for model import.

  data-format - the data format to permute - `java.lang.String`
  weights - `boolean`

  returns: the permuted indices - `int[]`"
  ([^java.lang.String data-format ^Boolean weights]
    (SameDiff/permuteDataFormatForSameDiff data-format weights)))

(defn *parse-variable
  "Note: INTENDED FOR DEVELOPER USE
  This method extract base variable name and output index (if exists) from raw variable name.
  I.e:
  - if variable name is \"Unstack_2\", result will be Pair(\"Unstack_2\", 0)
  - if variable name is \"Unstack_2:12\", result will be Pair(\"Unstack_2\", 12)

  var-name - `java.lang.String`

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.Integer>`"
  (^org.nd4j.linalg.primitives.Pair [^java.lang.String var-name]
    (SameDiff/parseVariable var-name)))

(defn *new-cloner
  "returns: New cloner object. NOTE: INTENDED FOR DEVELOPER USE ONLY - `com.rits.cloning.Cloner`"
  (^com.rits.cloning.Cloner []
    (SameDiff/newCloner )))

(defn *get-order-as-byte
  "This method returns current byte order for this JVM as libnd4j enum

  returns: `byte`"
  (^Byte []
    (SameDiff/getOrderAsByte )))

(defn *get-order-from-byte
  "This method just converts enums

  val - `byte`

  returns: `java.nio.ByteOrder`"
  (^java.nio.ByteOrder [^Byte val]
    (SameDiff/getOrderFromByte val)))

(defn *get-flat-op-type
  "This method converts an Op.Type to it's corresponding byte value

  type - type to convert - `org.nd4j.linalg.api.ops.Op$Type`

  returns: Byte representing the op type - `byte`"
  (^Byte [^org.nd4j.linalg.api.ops.Op$Type type]
    (SameDiff/getFlatOpType type)))

(defn *get-op-num
  "This method return operation ID for given op name/type pair.

  name - `java.lang.String`
  type - `org.nd4j.linalg.api.ops.Op$Type`

  returns: `long`"
  (^Long [^java.lang.String name ^org.nd4j.linalg.api.ops.Op$Type type]
    (SameDiff/getOpNum name type)))

(defn *create
  "Create a new SameDiff instance from an existing instance.
  Note that state (variables and functions) is shared between the two SameDiff instance

  original-same-diff - Original SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`

  returns: Copy - `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^org.nd4j.autodiff.samediff.SameDiff original-same-diff]
    (SameDiff/create original-same-diff))
  (^org.nd4j.autodiff.samediff.SameDiff []
    (SameDiff/create )))

(defn *get-data-type-from-byte
  "This method converts enums for DataType

  val - `byte`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^Byte val]
    (SameDiff/getDataTypeFromByte val)))

(defn hard-sigmoid
  "Element-wise hard sigmoid function:
  out[i] = 0 if in[i] <= -2.5
  out[1] = 0.2*in[i]+0.5 if -2.5 < in[i] < 2.5
  out[i] = 1 if in[i] >= 2.5

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.hardSigmoid name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.hardSigmoid in))))

(defn random-normal
  "Generate a new random SDVariable, where values are randomly sampled according to a Gaussian (normal) distribution,
  N(mean, stdev)
  See randomNormal(String, double, double, long...) for the equivalent function where the shape is
  specified as a long[] instead

  name - Name of the new SDVariable - `java.lang.String`
  mean - Mean value for the random array - `double`
  stddev - Standard deviation for the random array - `double`
  shape - Shape of the new random SDVariable, as a 1D array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double mean ^Double stddev ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomNormal name mean stddev shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double mean ^Double stddev ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomNormal mean stddev shape))))

(defn hamming-distance
  "Hamming distance reduction operation. The output contains the cosine distance for each
  tensor/subset along the specified dimensions:
  out = count( x[i] != y[i] )

  name - Name of the output variable - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate cosine similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.hammingDistance name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.hammingDistance x y dimensions))))

(defn get-variables-associated-with-functions
  "Get the SDVariable associated with each function based on the
  DifferentialFunction.outputVariables() ()}

  functions - the functions to get the variables for - `java.util.List`

  returns: the list of variables associated with the given DifferentialFunction - `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SameDiff this ^java.util.List functions]
    (-> this (.getVariablesAssociatedWithFunctions functions))))

(defn add-var-name-for-import
  "Marks a variable name as imported.
  This is used in conjunction with model
  import to ensure immutability
  when referencing graph variables
  mapped from an external source.

  var-name - the var name to add. - `java.lang.String`"
  ([^SameDiff this ^java.lang.String var-name]
    (-> this (.addVarNameForImport var-name))))

(defn invoke
  "Invoke an op by opName

  op - the op - `org.nd4j.linalg.api.ops.Op`
  x - the first input - `org.nd4j.autodiff.samediff.SDVariable`
  y - the second input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: the result variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.linalg.api.ops.Op op ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.invoke op x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.linalg.api.ops.Op op ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.invoke op x))))

(defn space-to-batch
  "Convolution 2d layer space to batch operation on 4d input.
  Increases input batch dimension by rearranging data from spatial dimensions into batch dimension

  name - Output variable name - `java.lang.String`
  x - Input variable. 4d input - `org.nd4j.autodiff.samediff.SDVariable`
  blocks - Block size, in the height/width dimension - `int[]`
  padding - Optional 2d int[] array for padding the result: values [[pad top, pad bottom], [pad left, pad right]] - `int[][]`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x blocks padding]
    (-> this (.spaceToBatch name x blocks padding)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x blocks padding]
    (-> this (.spaceToBatch x blocks padding))))

(defn softsign-derivative
  "Element-wise derivative (dOut/dIn) of the softsign function softsign(SDVariable)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output varible - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softsignDerivative name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softsignDerivative x))))

(defn floor
  "Element-wise floor function: out = floor(x).
  Rounds each value down to the nearest integer value (if not already an integer)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.floor name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.floor x))))

(defn invert-permutation
  "Compute the inverse permutation indices for a permutation operation
  Example: if input is [2, 0, 1] then output is [1, 2, 0]
  The idea is that x.permute(input).permute(invertPermutation(input)) == x

  name - name of the output variable - `java.lang.String`
  input - 1D indices for permutation - `org.nd4j.autodiff.samediff.SDVariable`

  returns: 1D inverted permutation - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.invertPermutation name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.invertPermutation input))))

(defn log-1p
  "Elementwise natural logarithm function: out = log_e (1  x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.log1p name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.log1p x))))

(defn im-2-col
  "im2col operation for use in 2D convolution operations. Outputs a 6d array with shape
  [minibatch, inputChannels, kernelHeight, kernelWidth, outputHeight, outputWidth]

  name - Name of the output variable - `java.lang.String`
  in - Input - rank 4 input with shape [minibatch, inputChannels, height, width] - `org.nd4j.autodiff.samediff.SDVariable`
  config - Convolution configuration for the im2col operation - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: Im2Col output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.im2Col name in config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.im2Col in config))))

(defn ceil
  "Element-wise ceiling function: out = ceil(x).
  Rounds each value up to the nearest integer value (if not already an integer)

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.ceil name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.ceil x))))

(defn get-grad-for-variable
  "Get the gradient for the given vertex id

  var-name - the vertex id - `java.lang.String`

  returns: the gradient for this variable or null - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String var-name]
    (-> this (.getGradForVariable var-name))))

(defn random-normal-truncated
  "Generate a new random SDVariable, where values are randomly sampled according to a Gaussian (normal) distribution,
  N(mean, stdev). However, any values more than 1 standard deviation from the mean are dropped and re-sampled

  name - Name of the new SDVariable - `java.lang.String`
  mean - Mean value for the random array - `double`
  stddev - Standard deviation for the random array - `double`
  shape - Shape of the new random SDVariable - `long`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double mean ^Double stddev ^Long shape]
    (-> this (.randomNormalTruncated name mean stddev shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double mean ^Double stddev ^Long shape]
    (-> this (.randomNormalTruncated mean stddev shape))))

(defn deconv-2d
  "2D deconvolution operation with optional bias

  layer-input - the input to deconvolution 2d operation - 4d CNN (image) activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights for the 2d deconvolution operation. 4 dimensions.If layer input data is in NCHW format, weights should have format [inputChannels, outputChannels, kernelHeight, kernelWidth].If layer input data is in NHWC format, weight should have format [kernelHeight, kernelWidth, outputChannels, inputChannels] - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional 1D bias array with shape [outputChannels]. May be null. - `org.nd4j.autodiff.samediff.SDVariable`
  deconv-2-d-config - DeConv2DConfig configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig`

  returns: result of deconv2d op - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig deconv-2-d-config]
    (-> this (.deconv2d layer-input weights bias deconv-2-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig deconv-2-d-config]
    (-> this (.deconv2d layer-input weights deconv-2-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig deconv-2-d-config]
    (-> this (.deconv2d inputs deconv-2-d-config))))

(defn moments
  "Calculate the mean and (population) variance for the input variable, for the specified axis

  name - Name of the output variables. Can be null; if non-null, must be length 2 - `java.lang.String[]`
  input - Input to calculate moments for - `org.nd4j.autodiff.samediff.SDVariable`
  axes - Dimensions to perform calculation over - `int`

  returns: Mean and variance variables - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this name ^org.nd4j.autodiff.samediff.SDVariable input ^Integer axes]
    (-> this (.moments name input axes)))
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer axes]
    (-> this (.moments input axes))))

(defn lstm
  "LSTM unit

  base-name - the base name for outputs - `java.lang.String`
  configuration - the configuration to use - `org.nd4j.linalg.api.ops.impl.layers.recurrent.config.LSTMCellConfiguration`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String base-name ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.LSTMCellConfiguration configuration]
    (-> this (.lstm base-name configuration))))

(defn range
  "Create a new variable with a 1d array, where the values start at from and increment by step
  up to (but not including) limit.
  For example, range(1.0, 3.0, 0.5) will return [1.0, 1.5, 2.0, 2.5]

  name - Name of the new variable - `java.lang.String`
  from - Initial/smallest value - `double`
  to - Largest value (exclusive) - `double`
  step - Step size - `double`

  returns: 1D SDVariable with the specified values - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double from ^Double to ^Double step]
    (-> this (.range name from to step)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double from ^Double to ^Double step]
    (-> this (.range from to step))))

(defn exec-with-place-holder
  "Creates and executes a list of operations based on the given variables passed in.
  resolveVariablesWith(Map) is called

  inputs - `java.util.Map`

  returns: `org.nd4j.linalg.primitives.Pair<java.util.Map<org.nd4j.autodiff.samediff.SDVariable,org.nd4j.autodiff.functions.DifferentialFunction>,java.util.List<org.nd4j.autodiff.functions.DifferentialFunction>>`"
  (^org.nd4j.linalg.primitives.Pair [^SameDiff this ^java.util.Map inputs]
    (-> this (.execWithPlaceHolder inputs))))

(defn diag
  "Returns an output variable with diagonal values equal to the specified values; off-diagonal values will be set to 0
  For example, if input = [1,2,3], then output is given by:
  [ 1, 0, 0]
  [ 0, 2, 0]
  [ 0, 0, 3]

  Higher input ranks are also supported: if input has shape [a,...,R-1] then output[i,...,k,i,...,k] = input[i,...,k].
  i.e., for input rank R, output has rank 2R

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.diag name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.diag x))))

(defn place-holder?
  "Returns true if this vertex id is a place holder variable or not
  A place holder variable is one where the array shape(s) are currently known and can't yet be calculated

  var-name - the vertex id to test - `java.lang.String`

  returns: True if the variable is a placeholder, false otherwise - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String var-name]
    (-> this (.isPlaceHolder var-name))))

(defn sru-cell
  "An sru cell

  base-name - the base name to use for the output variables - `java.lang.String`
  configuration - the configuration for the sru cell - `org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUCellConfiguration`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String base-name ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUCellConfiguration configuration]
    (-> this (.sruCell base-name configuration)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUCellConfiguration configuration]
    (-> this (.sruCell configuration))))

(defn random-binomial
  "Generate a new random SDVariable, where values are randomly sampled according to a Binomial distribution,
  with the specified number of trials and probability.

  name - Name of the new SDVariable - `java.lang.String`
  n-trials - Number of trials parameter for the binomial distribution - `int`
  p - Probability of success for each trial - `double`
  shape - Shape of the new random SDVariable, as a 1D array - `long`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer n-trials ^Double p ^Long shape]
    (-> this (.randomBinomial name n-trials p shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Integer n-trials ^Double p ^Long shape]
    (-> this (.randomBinomial n-trials p shape))))

(defn put-list-by-name
  "name - `java.lang.String`
  list - `org.nd4j.list.compat.TensorList`"
  ([^SameDiff this ^java.lang.String name ^org.nd4j.list.compat.TensorList list]
    (-> this (.putListByName name list))))

(defn put-function-for-id
  "Put the function for the given id

  id - the id of the function - `java.lang.String`
  function - the function - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this ^java.lang.String id ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.putFunctionForId id function))))

(defn set-diag
  "Set the diagonal value to the specified values
  If input is
  [ a, b, c]
  [ d, e, f]
  [ g, h, i]
  and diag = [ 1, 2, 3] then output is
  [ 1, b, c]
  [ d, 2, f]
  [ g, h, 3]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  diag - Diagonal - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable diag]
    (-> this (.setDiag name in diag)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable diag]
    (-> this (.setDiag in diag))))

(defn cosh
  "Elementwise cosh (hyperbolic cosine) operation: out = cosh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cosh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cosh x))))

(defn selu
  "Element-wise SeLU function - Scaled exponential Lineal Unit: see Self-Normalizing Neural Networks

  out[i] = scale * alpha * (exp(in[i])-1) if in[i]>0, or 0 if in[i] <= 0
  Uses default lcale and alpha values.

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.selu name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.selu x))))

(defn sigmoid-derivative
  "Element-wise sigmoid function derivative: dL/dIn given input and dL/dOut

  name - Output variable name - `java.lang.String`
  x - Input Variable - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - Gradient at the output - dL/dOut. Must have same shape as the input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.sigmoidDerivative name x wrt)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.sigmoidDerivative x wrt))))

(defn add-as-place-holder
  "Add this vertex id as a place holder

  var-name - the vertex id to add - `java.lang.String`"
  ([^SameDiff this ^java.lang.String var-name]
    (-> this (.addAsPlaceHolder var-name))))

(defn loss-kld
  "Kullback-Leibler divergence loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossKLD x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossKLD name x y dimensions))))

(defn add-variable-mapping-for-field
  "Adds a field name -> variable name mapping for a given function.
  This is used for model import where there is an unresolved variable at the time of calling any
  GraphMapper.importGraph(File)
  .

  This data structure is typically accessed during DifferentialFunction.resolvePropertiesFromSameDiffBeforeExecution()

  When a function attempts to resolve variables right before execution, there needs to be a way of knowing
  which variable in a samediff graph should map to a function's particular field name

  function - the function to map - `org.nd4j.autodiff.functions.DifferentialFunction`
  field-name - the field name for the function to map - `java.lang.String`
  var-name - the variable name of the array to get from samediff - `java.lang.String`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function ^java.lang.String field-name ^java.lang.String var-name]
    (-> this (.addVariableMappingForField function field-name var-name))))

(defn batch-to-space
  "Convolution 2d layer batch to space operation on 4d input.
  Reduces input batch dimension by rearranging data into a larger spatial dimensions

  name - Output variable name - `java.lang.String`
  x - Input variable. 4d input - `org.nd4j.autodiff.samediff.SDVariable`
  blocks - Block size, in the height/width dimension - `int[]`
  crops - Optional 2d int[] array: values [[crop top, crop bottom], [crop left, crop right]] - `int[][]`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x blocks crops]
    (-> this (.batchToSpace name x blocks crops)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x blocks crops]
    (-> this (.batchToSpace x blocks crops))))

(defn min
  "Minimum array reduction operation, optionally along specified dimensions. out = min(in)
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.min name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.min name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.min x dimensions))))

(defn resolve-variables-with
  "Resolve all ndarrays by updating the variables for each array specified in the given map.
  An IllegalStateException will be thrown if not all arrays are specified for resolution.

  arrays - the arrays to resolve. - `java.util.Map`"
  ([^SameDiff this ^java.util.Map arrays]
    (-> this (.resolveVariablesWith arrays))))

(defn exec-and-end-result
  "Execute the specified ops and return the output of the last one

  ops - Ops to execute - `java.util.List`

  returns: Output (or first output) of the final op in the list, after execution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this ^java.util.List ops]
    (-> this (.execAndEndResult ops)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this]
    (-> this (.execAndEndResult))))

(defn elu-derivative
  "Element-wise derivative exponential linear unit (ELU) function, dOut/dIn given input.
  elu(SDVariable)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.eluDerivative name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.eluDerivative x))))

(defn conv-3d
  "Convolution 3D operation with optional bias

  name - Name of the output variable - `java.lang.String`
  input - the input to average pooling 3d operation - 5d activations in NCDHW format(shape [minibatch, channels, depth, height, width]) or NDHWC format(shape [minibatch, depth, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights for conv3d. Rank 5.If input data is in NCDHW fomat, weights should have shape [outputChannels, inputChannels, kernelDepth, kernelHeight, kernelWidth].If input data is in NDHWC fomat, weights should have shape [kernelDepth, kernelHeight, kernelWidth, inputChannels, outputChannels]. - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional 1D bias array with shape [outputChannels]. May be null. - `org.nd4j.autodiff.samediff.SDVariable`
  conv-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig`

  returns: Conv3d output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig conv-3-d-config]
    (-> this (.conv3d name input weights bias conv-3-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig conv-3-d-config]
    (-> this (.conv3d input weights bias conv-3-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig conv-3-d-config]
    (-> this (.conv3d input weights conv-3-d-config))))

(defn sru
  "Simiple recurrent unit

  base-name - the base name to use for output variables - `java.lang.String`
  configuration - the configuration for the sru - `org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUConfiguration`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String base-name ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUConfiguration configuration]
    (-> this (.sru base-name configuration)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUConfiguration configuration]
    (-> this (.sru configuration))))

(defn scatter-max
  "Scatter max operation.
  If indices is rank 0 (a scalar), then out[index, ...] = max(updates[...], in[index,...])
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] = max(updates[i,...], in[indices[i],...])
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] = max(updates[i, ..., k, ...], in[indices[i], ..., indices[k], ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMax name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMax ref indices updates))))

(defn as-flat-print
  "This method returns a text representation of the \"flattened\" graph.

  returns: String representation of the graph - `java.lang.String`"
  (^java.lang.String [^SameDiff this]
    (-> this (.asFlatPrint))))

(defn assign
  "Assign/copy op: out = x.assign(y). Supports broadcasting

  name - Name of the output variable - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.assign name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.assign x y))))

(defn hard-tanh
  "Element-wise hard tanh function:
  out[i] = -1 if in[i] <= -1
  out[1] = in[i] if -1 < in[i] < 1
  out[i] = 1 if in[i] >= 1

  name - Output variable name - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.hardTanh name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.hardTanh in))))

(defn iamin
  "Index of the min absolute value: argmin(abs(in))

  name - `java.lang.String`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamin name in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamin in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.iamin in dimensions))))

(defn standard-deviation
  "Stardard deviation array reduction operation, optionally along specified dimensions
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - If true: divide by (N-1) (i.e., sample stdev). If false: divide by N (population stdev) - `boolean`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.standardDeviation name x bias-corrected keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.standardDeviation name x bias-corrected dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.standardDeviation x bias-corrected dimensions))))

(defn jaccard-distance
  "Jaccard similarity reduction operation. The output contains the Jaccard distance for each
  tensor along the the specified dimensions.

  name - Name of the output variable - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate Jaccard similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.jaccardDistance name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.jaccardDistance x y dimensions))))

(defn lt
  "Less than operation: elementwise x < y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.lt name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.lt x y))))

(defn neq
  "Not equals operation: elementwise x != y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.neq name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.neq x y))))

(defn get-function
  "Get a SameDiff function instance given the name of the function

  function-name - the name of the function - `java.lang.String`

  returns: the same diff function instance defined for the given name - `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^SameDiff this ^java.lang.String function-name]
    (-> this (.getFunction function-name))))

(defn squeeze
  "Remove a single dimension of size 1.
  For example, if input has shape [a,b,1,c] then squeeze(input, 2) returns an array of shape [a,b,c]

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  axis - Size 1 dimension to remove - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.squeeze name x axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.squeeze x axis))))

(defn loss-l-1
  "L1 loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossL1 x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossL1 name x y dimensions))))

(defn is-non-decreasing
  "Is the array non decreasing?
  An array is non-decreasing if for every valid i, x[i] <= x[i+1]. For Rank 2+ arrays, values are compared
  in 'c' (row major) order

  name - Output name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Scalar variable with value 1 if non-decreasing, or 0 otherwise - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNonDecreasing name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNonDecreasing x))))

(defn set-base-name-for-function-instance-id
  "Sets a base name for the function id.
  This is used for when calling generateOutputVariableForOp(DifferentialFunction, String)
  for ensuring original names for model import map to current samediff names
  when names are generated.

  base-name - the base name to add - `java.lang.String`
  function - the function to declare a base name for. - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this ^java.lang.String base-name ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.setBaseNameForFunctionInstanceId base-name function))))

(defn f
  "Returns this samediff instance's DifferentialFunctionFactory

  returns: `org.nd4j.autodiff.functions.DifferentialFunctionFactory`"
  (^org.nd4j.autodiff.functions.DifferentialFunctionFactory [^SameDiff this]
    (-> this (.f))))

(defn rsqrt
  "Element-wise reciprocal (inverse) of square root: out = 1.0 / sqrt(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.rsqrt name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.rsqrt x))))

(defn get-function-by-id
  "Get the function by the DifferentialFunction#getOwnName()

  id - the id of the function - `java.lang.String`

  returns: the function for the given id if it exists - `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^SameDiff this ^java.lang.String id]
    (-> this (.getFunctionById id))))

(defn exec-and-end-results
  "Execute the graph using the current arrays/state and return the array(s) for the final variable in the graph.
  After execution, the arrays for other variables can be obtained using getArrForVarName(String)
  or SDVariable.getArr()

  returns: The outputs of the final operation in the graph, after execution - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^SameDiff this]
    (-> this (.execAndEndResults))))

(defn matrix-inverse
  "Matrix inverse op. For 2D input, this returns the standard matrix inverse.
  For higher dimensional input with shape [..., m, m] the matrix inverse is returned for each
  shape [m,m] sub-matrix.

  name - Name of the output variable - `java.lang.String`
  in - Input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Matrix inverse variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixInverse name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixInverse in))))

(defn log-softmax
  "Log softmax activation

  name - Variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.logSoftmax name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.logSoftmax x))))

(defn depth-wise-conv-2d
  "Depth-wise 2D convolution operation with optional bias

  layer-input - the input to max pooling 2d operation - 4d CNN (image) activations in NCHW format (shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  depth-weights - depth-wise conv 2D weights. 4 dimensions.If layer input data is in NCHW format, weights should have format [outputChannels, inputChannels, kernelHeight, kernelWidth].If layer input data is in NHWC format, weight should have format [kernelHeight, kernelWidth, inputChannels, outputChannels] - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional 1D bias array with shape [outputChannels]. May be null. - `org.nd4j.autodiff.samediff.SDVariable`
  config - Conv2DConfig configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: result of depthwise conv2d op - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable depth-weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.depthWiseConv2d layer-input depth-weights bias config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable depth-weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.depthWiseConv2d layer-input depth-weights config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig depth-conv-2-d-config]
    (-> this (.depthWiseConv2d inputs depth-conv-2-d-config))))

(defn segment-mean
  "Segment mean operation.
  If data = [3, 6, 1, 4, 9, 2, 8]
  segmentIds = [0, 0, 1, 1, 1, 2, 2]
  then output = [4.5, 4.666, 5] = [mean(3,6), mean(1,4,9), mean(2,8)

  name - Name of the output variable. May be null - `java.lang.String`
  data - Data to perform segment max on - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - Variable for the segment IDs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Segment mean output - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMean name data segment-ids)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMean data segment-ids))))

(defn cosine-similarity
  "Cosine similarity pairwise reduction operation. The output contains the cosine similarity for each tensor/subset
  along the specified dimensions:
  out = (sum_i x[i] * y[i]) / ( sqrt(sum_i x[i]^2) * sqrt(sum_i y[i]^2)

  name - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate cosine similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.cosineSimilarity name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.cosineSimilarity x y dimensions))))

(defn get-original-shape-for-place-holder
  "Get the original shape for the vertex id if one was set (other wise returns null).
  This is mainly for use in validating passed in arrays as arguments to resolveVariablesWith(Map)
  usually when executing using execWithPlaceHolder(Map)

  var-name - the vertex id to get the original shape for. - `java.lang.String`

  returns: the set vertex - `long[]`"
  ([^SameDiff this ^java.lang.String var-name]
    (-> this (.getOriginalShapeForPlaceHolder var-name))))

(defn cosine-distance
  "Cosine distance reduction operation. The output contains the cosine distance for each
  tensor/subset along the specified dimensions:
  out = 1.0 - cosineSimilarity(x,y)
  See cosineSimilarity(String, SDVariable, SDVariable, int...)

  name - Name of the output variable - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate cosine similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.cosineDistance name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.cosineDistance x y dimensions))))

(defn unstack
  "Unstack a variable of rank X into N rank X-1 variables by taking slices along the specified axis.
  If input has shape [a,b,c] then output has shape:
  axis = 0: [b,c]
  axis = 1: [a,c]
  axis = 2: [a,b]

  names - Output variable names. May be null - `java.lang.String[]`
  value - Input variable to unstack - `org.nd4j.autodiff.samediff.SDVariable`
  axis - Axis to unstack on - `int`
  num - Number of output variables - `int`

  returns: Output variables - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this names ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis ^Integer num]
    (-> this (.unstack names value axis num)))
  ([^SameDiff this names ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis]
    (-> this (.unstack names value axis)))
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis]
    (-> this (.unstack value axis))))

(defn first-index
  "First index reduction operation.
  Returns a variable that contains the index of the first element that matches the specified condition (for each
  slice along the specified dimensions)
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition to check on input variable - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - If true: keep the dimensions that are reduced on (as length 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (-> this (.firstIndex name in condition keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimensions]
    (-> this (.firstIndex name in condition dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimensions]
    (-> this (.firstIndex in condition dimensions))))

(defn invoke-graph-on
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.invokeGraphOn same-diff))))

(defn relu-6
  "Element-wise \"rectified linear 6\" function with specified cutoff:
  out[i] = min(max(in, cutoff), 6)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - Cutoff value. Usually 0 - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double cutoff]
    (-> this (.relu6 name x cutoff)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double cutoff]
    (-> this (.relu6 x cutoff))))

(defn loss-hinge
  "Hinge loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossHinge x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossHinge name x y dimensions))))

(defn leaky-relu
  "Element-wise leaky ReLU function:
  out = x if x >= 0.0
  out = alpha * x if x < cutoff
  Alpha value is most commonly set to 0.01

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  alpha - Cutoff - usually 0.0 - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double alpha]
    (-> this (.leakyRelu name x alpha)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double alpha]
    (-> this (.leakyRelu x alpha))))

(defn update-variable-name-and-reference
  "Updates the variable name property on the passed in variable, the reference in samediff, and returns the variable.

  Note that if null for the new variable is passed in, it will just return the original input variable.

  var-to-update - the variable to update - `org.nd4j.autodiff.samediff.SDVariable`
  new-var-name - the new variable name - `java.lang.String`

  returns: the passed in variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable var-to-update ^java.lang.String new-var-name]
    (-> this (.updateVariableNameAndReference var-to-update new-var-name))))

(defn shape
  "Returns the shape of the specified SDVariable as a 1D SDVariable

  name - Name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: 1D output variable with contents equal to the shape of the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.shape name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.shape input))))

(defn scalar
  "Create a new scalar (rank 0) SDVariable with the specified value

  name - Name of the SDVariable - `java.lang.String`
  value - Value to initialize the variable with - `double`

  returns: SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double value]
    (-> this (.scalar name value))))

(defn scatter-div
  "Scatter division operation.
  If indices is rank 0 (a scalar), then out[index, ...] /= updates[...]
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] /= updates[i, ...]
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] /= updates[i, ..., k, ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterDiv name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterDiv ref indices updates))))

(defn erfc
  "Element-wise complementary Gaussian error function - out = erfc(in) = 1 - erf(in)

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.erfc name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.erfc x))))

(defn has-properties-to-resolve?
  "Returns true if the given function has ndarray properties to resolve.

  function - the function to check - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: true if the function has yet to be resolved properties - `boolean`"
  (^Boolean [^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.hasPropertiesToResolve function))))

(defn confusion-matrix
  "Compute the 2d confusion matrix of size [numClasses, numClasses] from a pair of labels and predictions, both of
  which are represented as integer values.
  For example, if labels = [0, 1, 1], predicted = [0, 2, 1], numClasses = 4, and weights = [1, 2, 3]
  [1, 0, 0, 0]
  [0, 3, 2, 0]
  [0, 0, 0, 0]
  [0, 0, 0, 0]

  name - Name of the output variable - `java.lang.String`
  labels - Labels - 1D array of integer values representing label values - `org.nd4j.autodiff.samediff.SDVariable`
  pred - Predictions - 1D array of integer values representing predictions. Same length as labels - `org.nd4j.autodiff.samediff.SDVariable`
  num-classes - `java.lang.Integer`
  weights - Weights - 1D array of values (may be real/decimal) representing the weight/contribution ofeach prediction. Must be same length as both labels and predictions arrays - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable (2D, shape [numClasses, numClasses}) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^java.lang.Integer num-classes ^org.nd4j.autodiff.samediff.SDVariable weights]
    (-> this (.confusionMatrix name labels pred num-classes weights)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^java.lang.Integer num-classes]
    (-> this (.confusionMatrix name labels pred num-classes)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred]
    (-> this (.confusionMatrix name labels pred)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable predictions]
    (-> this (.confusionMatrix labels predictions))))

(defn iamax
  "Index of the max absolute value: argmax(abs(in))

  name - `java.lang.String`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamax name in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamax in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.iamax in dimensions))))

(defn constant
  "Return a variable of given shape in which all values have a given constant value.

  name - Name of the new SDVariable - `java.lang.String`
  value - constant to set for each value - `org.nd4j.autodiff.samediff.SDVariable`
  shape - shape of the variable as long array - `long`

  returns: A new SDVariable of provided shape with constant value. - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable value ^Long shape]
    (-> this (.constant name value shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable value ^Long shape]
    (-> this (.constant value shape))))

(defn bias-add
  "Bias addition operation: a special case of addition, typically used with CNN 4D activations and a 1D bias vector

  name - Name of the output variable - `java.lang.String`
  input - 4d input variable - `org.nd4j.autodiff.samediff.SDVariable`
  bias - 1d bias - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.biasAdd name input bias)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.biasAdd input bias))))

(defn invoke-function-on
  "function-name - `java.lang.String`
  with - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String function-name ^org.nd4j.autodiff.samediff.SameDiff with]
    (-> this (.invokeFunctionOn function-name with))))

(defn eq
  "Equals operation: elementwise x == y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.eq name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.eq x y))))

(defn atan-2
  "Elementwise atan (arctangent, inverse tangent) operation: out = atan2(x,y).
  Similar to atan(y/x) but sigts of x and y are used to determine the the location of the result

  name - Name of the output variable - `java.lang.String`
  y - Input Y variable - `org.nd4j.autodiff.samediff.SDVariable`
  x - Input X variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atan2 name y x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atan2 y x))))

(defn squared-norm
  "Squared L2 norm: see norm2(String, SDVariable, boolean, int...)

  name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.squaredNorm name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.squaredNorm name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.squaredNorm x dimensions))))

(defn argmax
  "Argmax array reduction operation, optionally along specified dimensions.
  Output values are the index of the maximum value of each slice along the specified dimension.

  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) if keepDims = false, or
  of rank (input rank) if keepdims = true - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.argmax name in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.argmax name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.argmax in dimensions))))

(defn mean
  "Mean (average) array reduction operation, optionally along specified dimensions
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimension - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimension]
    (-> this (.mean name x keep-dims dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimension]
    (-> this (.mean name x dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimension]
    (-> this (.mean x dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.mean x))))

(defn get-outputs-for-function
  "Returns the name(s) of the outputs for the given function

  function - the function to get the outputs for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the outputs ids for a given function - `java.lang.String[]`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getOutputsForFunction function))))

(defn segment-sum
  "Segment sum operation.
  If data = [3, 6, 1, 4, 9, 2, 8]
  segmentIds = [0, 0, 1, 1, 1, 2, 2]
  then output = [9, 14, 10] = [sum(3,6), sum(1,4,9), sum(2,8)

  name - Name of the output variable. May be null - `java.lang.String`
  data - Data to perform segment max on - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - Variable for the segment IDs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Segment sum output - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentSum name data segment-ids)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentSum data segment-ids))))

(defn gather-nd
  "TODO doc string

  name - `java.lang.String`
  df - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable indices]
    (-> this (.gatherNd name df indices)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable indices]
    (-> this (.gatherNd df indices))))

(defn var
  "Variable initialization with a specified WeightInitScheme

  name - the name of the variable - `java.lang.String`
  shape - the shape of the array to be created - `long[]`
  weight-init-scheme - the weight initialization scheme - `org.nd4j.weightinit.WeightInitScheme`

  returns: the created variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name shape ^org.nd4j.weightinit.WeightInitScheme weight-init-scheme]
    (-> this (.var name shape weight-init-scheme)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Long shape]
    (-> this (.var name shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable arr]
    (-> this (.var arr))))

(defn prod
  "Product array reduction operation, optionally along specified dimensions
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as length 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.prod name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.prod name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.prod x dimensions))))

(defn sum
  "Sum array reduction operation, optionally along specified dimensions.
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as length 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) if keepDims = false, or
  of rank (input rank) if keepdims = true - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.sum name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.sum name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.sum x dimensions))))

(defn is-numeric-tensor
  "Is the director a numeric tensor? In the current version of ND4J/SameDiff, this always returns true/1

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Scalar variable with value 1 - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNumericTensor name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNumericTensor x))))

(defn parallel-stack
  "name - `java.lang.String`
  values - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name values]
    (-> this (.parallel_stack name values)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this values]
    (-> this (.parallel_stack values))))

(defn reverse
  "Reverse the values of an array for the specified dimensions
  If input is:
  [ 1, 2, 3]
  [ 4, 5, 6]
  then
  reverse(in, 0):
  [3, 2, 1]
  [6, 5, 4]
  reverse(in, 0):
  [4, 5, 6]
  [1, 2 3]

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.reverse name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.reverse x dimensions))))

(defn normalize-moments
  "Calculate the mean and variance from the sufficient statistics

  name - Name of the output variables. Can be null; if non-null, must be length 2 - `java.lang.String[]`
  counts - Rank 0 (scalar) value with the total number of values used to calculate the sufficient statistics - `org.nd4j.autodiff.samediff.SDVariable`
  means - Mean-value sufficient statistics: this is the SUM of all data values - `org.nd4j.autodiff.samediff.SDVariable`
  variances - Variaance sufficient statistics: this is the squared sum of all data values - `org.nd4j.autodiff.samediff.SDVariable`
  shift - Shift value, possibly 0, used when calculating the sufficient statistics (for numerical stability) - `double`

  returns: Output variables: mean and population variance - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this name ^org.nd4j.autodiff.samediff.SDVariable counts ^org.nd4j.autodiff.samediff.SDVariable means ^org.nd4j.autodiff.samediff.SDVariable variances ^Double shift]
    (-> this (.normalizeMoments name counts means variances shift)))
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable counts ^org.nd4j.autodiff.samediff.SDVariable means ^org.nd4j.autodiff.samediff.SDVariable variances ^Double shift]
    (-> this (.normalizeMoments counts means variances shift))))

(defn get-forward-variable-for-vertex-id
  "Get the forward variable for gradient based on the gradient's vertex id

  vertex-id - the vertex id - `int`

  returns: the gradient for the variable or null - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Integer vertex-id]
    (-> this (.getForwardVariableForVertexId vertex-id))))

(defn dot
  "TODO doc string

  name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.dot name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.dot x y dimensions))))

(defn softmax-cross-entropy-with-logits
  "TODO

  name - `java.lang.String`
  logits - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  reduction-mode - `int`
  label-smoothing - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.softmaxCrossEntropyWithLogits name logits weights labels reduction-mode label-smoothing)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.softmaxCrossEntropyWithLogits logits weights labels reduction-mode label-smoothing))))

(defn max-pooling-3d
  "3D convolution layer operation - max pooling 3d operation.

  name - name of the operation in SameDiff - `java.lang.String`
  input - the input to average pooling 3d operation - 5d activations in NCDHW format(shape [minibatch, channels, depth, height, width]) or NDHWC format(shape [minibatch, depth, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`

  returns: Result after applying max pooling on the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.maxPooling3d name input pooling-3-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.maxPooling3d input pooling-3-d-config))))

(defn trace
  "Matrix trace operation
  For rank 2 matrices, the output is a scalar vith the trace - i.e., sum of the main diagonal.
  For higher rank inputs, output[a,b,c] = trace(in[a,b,c,:,:])

  name - Name of the output variable. May be null. - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Trace - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.trace name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.trace in))))

(defn elu
  "Element-wise exponential linear unit (ELU) function:
  out = x if x > 0
  out = a * (exp(x) - 1) if x <= 0
  with constant a = 1.0

  See: http://arxiv.org/abs/1511.07289

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.elu name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.elu x))))

(defn cross
  "Returns the pair-wise cross product of equal size arrays a and b: a x b = ||a||x||b|| sin(theta).
  Can take rank 1 or above inputs (of equal shapes), but note that the last dimension must have dimension 3

  name - `java.lang.String`
  a - First input - `org.nd4j.autodiff.samediff.SDVariable`
  b - Second input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Element-wise cross product - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable a ^org.nd4j.autodiff.samediff.SDVariable b]
    (-> this (.cross name a b)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable a ^org.nd4j.autodiff.samediff.SDVariable b]
    (-> this (.cross a b))))

(defn shape-already-exists-for-var-name
  "Returns true if the given vertex id and shape already exist.

  var-name - the vertex id - `java.lang.String`

  returns: true if the ndarray and vertex id already exist - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String var-name]
    (-> this (.shapeAlreadyExistsForVarName var-name))))

(defn get-input-variables-for-function
  "Get the input variable(s) for the specified differential function

  function - the function reference to get the input variable(s) for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the input variables for the given function - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getInputVariablesForFunction function))))

(defn cumprod
  "Cumulative product operation.
  For input: [ a, b, c], output is:
  exclusize=false, reverse=false: [a, a*b, a*b*c]
  exclusive=true, reverse=false, [0, a, a*b]
  exclusive=false, reverse=true: [a*b*c, b*c, c]
  exclusive=true, reverse=true: [b*c, c, 0]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - If true: exclude the first value - `boolean`
  reverse - If true: reverse the direction of the accumulation - `boolean`
  axis - Scalar axis argument for dimension to perform cumululative sum operations along - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumprod name in exclusive reverse axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumprod in exclusive reverse axis))))

(defn repeat
  "name - `java.lang.String`
  df - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable df ^Integer axis]
    (-> this (.repeat name df axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable df ^Integer axis]
    (-> this (.repeat df axis))))

(defn matrix-determinant
  "Matrix determinant op. For 2D input, this returns the standard matrix determinant.
  For higher dimensional input with shape [..., m, m] the matrix determinant is returned for each
  shape [m,m] sub-matrix.

  name - Name of the output variable - `java.lang.String`
  in - Input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Matrix determinant variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixDeterminant name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixDeterminant in))))

(defn roll-axis
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.rollAxis name x axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.rollAxis x axis))))

(defn add-property-to-resolve
  "Adds a property that needs to be resolve for later.
  These variables are typically values that are arrays
  that are named but have an unknown value till execution time.

  This is very common for model import.

  for-function - the function to add the property to resolve for - `org.nd4j.autodiff.functions.DifferentialFunction`
  array-name - the array name - `java.lang.String`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction for-function ^java.lang.String array-name]
    (-> this (.addPropertyToResolve for-function array-name))))

(defn set-forward-variable-for-var-name
  "var-name - `java.lang.String`
  forward-variable - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^SameDiff this ^java.lang.String var-name ^org.nd4j.autodiff.samediff.SDVariable forward-variable]
    (-> this (.setForwardVariableForVarName var-name forward-variable))))

(defn max
  "Max array reduction operation, optionally along specified dimensions
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.max name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.max name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.max x dimensions))))

(defn gru
  "The gru cell

  base-name - the base name for the gru cell - `java.lang.String`
  configuration - teh configuration to use - `org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String base-name ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration configuration]
    (-> this (.gru base-name configuration)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration configuration]
    (-> this (.gru configuration))))

(defn linspace
  "Create a new 1d array with values evenly spaced between values 'start' and 'stop'
  For example, linspace(start=3.0, stop=4.0, number=3) will generate [3.0, 3.5, 4.0]

  name - Name of the new variable - `java.lang.String`
  start - Start value - `double`
  stop - Stop value - `double`
  number - Number of values to generate - `long`

  returns: SDVariable with linearly spaced elements - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double start ^Double stop ^Long number]
    (-> this (.linspace name start stop number)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double start ^Double stop ^Long number]
    (-> this (.linspace start stop number))))

(defn scatter-sub
  "Scatter subtraction operation.
  If indices is rank 0 (a scalar), then out[index, ...] -= updates[...]
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] -= updates[i, ...]
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] -= updates[i, ..., k, ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterSub name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterSub ref indices updates))))

(defn diag-part
  "Extract the diagonal part from the input array.
  If input is
  [ 1, 0, 0]
  [ 0, 2, 0]
  [ 0, 0, 3]
  then output is [1, 2, 3].
  Supports higher dimensions: in general, out[i,...,k] = in[i,...,k,i,...,k]

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Diagonal part of the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.diagPart name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.diagPart x))))

(defn mmul
  "Matrix multiplication: out = mmul(x,y)
  Supports specifying a MMulTranspose argument to perform operation such as mmul(a^T, b), etc.

  name - Output variable name - `java.lang.String`
  x - First input variable - `org.nd4j.autodiff.samediff.SDVariable`
  y - Second input variable - `org.nd4j.autodiff.samediff.SDVariable`
  transpose - Transpose arguments - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmul name x y transpose)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmul x y transpose)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.mmul x y))))

(defn sigmoid
  "Element-wise sigmoid function: out[i] = 1.0/(1+exp(-in[i]))

  name - Output variable name - `java.lang.String`
  x - Input Variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sigmoid name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sigmoid x))))

(defn ones-like
  "Return a variable of all 1s, with the same shape as the input variable. Note that this is dynamic:
  if the input shape changes in later execution, the returned variable's shape will also be updated

  name - Name of the new SDVariable - `java.lang.String`
  input - Input SDVariable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: A new SDVariable with the same (dynamic) shape as the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.onesLike name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.onesLike input))))

(defn last-index
  "Last index reduction operation.
  Returns a variable that contains the index of the last element that matches the specified condition (for each
  slice along the specified dimensions)
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition to check on input variable - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (-> this (.lastIndex name in condition keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimensions]
    (-> this (.lastIndex name in condition dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Integer dimensions]
    (-> this (.lastIndex in condition dimensions))))

(defn define-function
  "function - `java.lang.String`
  function-definition - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  variables - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^SameDiff this ^java.lang.String function ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition function-definition variables]
    (-> this (.defineFunction function function-definition variables)))
  ([^SameDiff this ^java.lang.String function ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition function-definition]
    (-> this (.defineFunction function function-definition))))

(defn loss-mse
  "Mean squared error loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMSE x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMSE name x y dimensions))))

(defn reciprocal
  "Element-wise reciprocal (inverse) function: out[i] = 1 / in[i]

  name - Name of the output variable - `java.lang.String`
  a - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable a]
    (-> this (.reciprocal name a)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable a]
    (-> this (.reciprocal a))))

(defn loss-mae
  "Mean absolute error loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMAE x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMAE name x y dimensions))))

(defn pow
  "Element-wise power function: out = x^value

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  value - Power to raise each element to - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double value]
    (-> this (.pow name x value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double value]
    (-> this (.pow x value))))

(defn add-variable
  "Add the specified variable to this SameDiff instance

  variable - Variable to add - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable variable]
    (-> this (.addVariable variable))))

(defn permute
  "Array permutation operation: permute the dimensions according to the specified permutation indices.
  Example: if input has shape [a,b,c] and dimensions = [2,0,1] the output has shape [c,a,b]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: Output variable (permuted input) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.permute name x dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.permute x dimensions))))

(defn clip-by-value
  "Element-wise clipping function:
  out[i] = in[i] if in[i] >= clipValueMin and in[i] <= clipValueMax
  out[i] = clipValueMin if in[i] < clipValueMin
  out[i] = clipValueMax if in[i] > clipValueMax

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  clip-value-min - Minimum value for clipping - `double`
  clip-value-max - Maximum value for clipping - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value-min ^Double clip-value-max]
    (-> this (.clipByValue name x clip-value-min clip-value-max)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value-min ^Double clip-value-max]
    (-> this (.clipByValue x clip-value-min clip-value-max))))

(defn random-bernoulli
  "Generate a new random SDVariable, where values are randomly sampled according to a Bernoulli distribution,
  with the specified probability. Array values will have value 1 with probability P and value 0 with probability
  1-P.
  See randomBernoulli(String, double, long...) for the equivalent function where the shape is
  specified as a long[] instead

  name - Name of the new SDVariable - `java.lang.String`
  p - Probability of value 1 - `double`
  shape - Shape of the new random SDVariable, as a 1D array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double p ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomBernoulli name p shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double p ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomBernoulli p shape))))

(defn argmin
  "Argmin array reduction operation, optionally along specified dimensions.
  Output values are the index of the minimum value of each slice along the specified dimension.

  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as length 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) if keepDims = false, or
  of rank (input rank) if keepdims = true - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.argmin name in keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.argmin name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.argmin in dimensions))))

(defn scatter-min
  "Scatter min operation.
  If indices is rank 0 (a scalar), then out[index, ...] = min(updates[...], in[index,...])
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] = min(updates[i,...], in[indices[i],...])
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] = min(updates[i, ..., k, ...], in[indices[i], ..., indices[k], ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMin name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMin ref indices updates))))

(defn zero
  "Create a new variable with the specified shape, with all values initialized to 0

  name - the name of the variable to create - `java.lang.String`
  shape - the shape of the array to be created - `long[]`

  returns: the created variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name shape]
    (-> this (.zero name shape))))

(defn gradient-backwards-marker
  "Intended for internal/developer use

  name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.gradientBackwardsMarker name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.gradientBackwardsMarker x))))

(defn rank
  "Returns the rank (number of dimensions, i.e., length(shape)) of the specified SDVariable as a 0D scalar variable

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: 0D (scalar) output variable with value equal to the rank of the input variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.rank name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.rank in))))

(defn setup-function
  "Attempts to insert the DifferentialFunction reference in to this SameDiff instance.
  If the given array field with the given index already exists, it will do a reference check to ensure that the 2
  array fields are the same. If not, an exception is thrown.
  If the instances are the same (by semantics, not reference) then it will just return the original instance.
  This is to ensure that instances that are created are unique and reference checked.

  function - the array field to attempt to create - `X`

  returns: Original instance - `<X extends org.nd4j.autodiff.samediff.SDVariable> X`"
  ([^SameDiff this function]
    (-> this (.setupFunction function))))

(defn atan
  "Elementwise atan (arctangent, inverse tangent) operation: out = arctangent(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atan name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atan x))))

(defn gt
  "Greater than operation: elementwise x > y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.gt name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.gt x y))))

(defn conv-1d
  "Conv1d operation.

  name - name of the operation in SameDiff - `java.lang.String`
  input - the inputs to conv1d - `org.nd4j.autodiff.samediff.SDVariable`
  weights - weights for conv1d op - `org.nd4j.autodiff.samediff.SDVariable`
  conv-1-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig conv-1-d-config]
    (-> this (.conv1d name input weights conv-1-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig conv-1-d-config]
    (-> this (.conv1d input weights conv-1-d-config))))

(defn loss-msle
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMSLE name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMSLE x y dimensions))))

(defn exec
  "Exec the given function given the ops

  function-name - the opName of the function toexec - `java.lang.String`
  cached-ops - the cached operations - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.functions.DifferentialFunction>`"
  (^java.util.List [^SameDiff this ^java.lang.String function-name ^java.util.List cached-ops]
    (-> this (.exec function-name cached-ops)))
  (^java.util.List [^SameDiff this ^java.util.List ops]
    (-> this (.exec ops)))
  (^org.nd4j.linalg.primitives.Pair [^SameDiff this]
    (-> this (.exec))))

(defn log
  "Element-wise logarithm function (with specified base): out = log_{base}(x)

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  base - Logarithm base - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Double base]
    (-> this (.log name in base)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.log name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.log x))))

(defn zeros-like
  "Return a variable of all 0s, with the same shape as the input variable. Note that this is dynamic:
  if the input shape changes in later execution, the returned variable's shape will also be updated

  name - Name of the new SDVariable - `java.lang.String`
  input - Input SDVariable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: A new SDVariable with the same (dynamic) shape as the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zerosLike name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zerosLike input))))

(defn acosh
  "Elementwise acosh (inverse hyperbolic cosine) function: out = acosh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.acosh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.acosh x))))

(defn gte
  "Greater than or equals operation: elementwise x >= y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.gte name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.gte x y))))

(defn summary
  "Generate and return a String representation of the current SameDiff instance
  Reports variables, ops, SameDiff function instances, and (where possible) array shapes.
  For ops, the input and output variables are reported.
  For variables, the ops that they are inputs to - or outputs of - are also reported

  returns: A String representation of the SameDiff instance - `java.lang.String`"
  (^java.lang.String [^SameDiff this]
    (-> this (.summary))))

(defn hard-tanh-derivative
  "Derivative (dOut/dIn) of the element-wise hard Tanh function - hardTanh(SDVariable)

  name - Output variable name - `java.lang.String`
  x - Input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.hardTanhDerivative name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.hardTanhDerivative x))))

(defn put-shape-for-var-name
  "Associate a vertex id with the given shape.

  var-name - the vertex id to associate - `java.lang.String`
  shape - the shape to associate with - `long[]`"
  ([^SameDiff this ^java.lang.String var-name shape]
    (-> this (.putShapeForVarName var-name shape))))

(defn size-at
  "Returns a rank 0 (scalar) variable for the size of the specified dimension.
  For example, if X has shape [10,20,30] then sizeAt(X,1)=20. Similarly, sizeAt(X,-1)=30

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - Dimension to get size of - `int`

  returns: Scalar SDVariable for size at specified variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimension]
    (-> this (.sizeAt name in dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimension]
    (-> this (.sizeAt in dimension))))

(defn count-non-zero
  "Count non zero array reduction operation, optionally along specified dimensions: out = count(x != 0)

  name - Name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countNonZero name input dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countNonZero input dimensions))))

(defn gather
  "Gather slices from the input variable where the indices are specified as fixed int[] values.
  Output shape is same as input shape, except for axis dimension, which has size equal to indices.length.

  name - name of the output variable - `java.lang.String`
  df - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices to get - `int[]`
  axis - Axis that the indices refer to - `int`

  returns: Output variable with slices pulled from the specified axis - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable df indices ^Integer axis]
    (-> this (.gather name df indices axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable df indices ^Integer axis]
    (-> this (.gather df indices axis))))

(defn reshape
  "Reshape the input variable to the specified (fixed) shape. The output variable will have the same values as the
  input, but with the specified shape.
  Note that prod(shape) must match length(input) == prod(input.shape)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  shape - New shape for variable - `long`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Long shape]
    (-> this (.reshape name x shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Long shape]
    (-> this (.reshape x shape))))

(defn get-property-for-function
  "Get the property for a given function

  function-instance - the function to get theproperty for - `org.nd4j.autodiff.functions.DifferentialFunction`
  property-name - the name of the property to get - `java.lang.String`

  returns: the property for the given function - `<T> T`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function-instance ^java.lang.String property-name]
    (-> this (.getPropertyForFunction function-instance property-name))))

(defn space-to-depth
  "Convolution 2d layer space to depth operation on 4d input.
  Increases input channels (reduced spatial dimensions) by rearranging data into a larger channels dimension
  Example: if input has shape [mb, 2, 4, 4] and block size is 2, then output size is [mb, 8/(2*2), 2*2, 2*2]
  = [mb, 2, 4, 4]

  name - Output variable name - `java.lang.String`
  x - the input to depth to space pooling 2d operation - 4d activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  block-size - Block size, in the height/width dimension - `int`
  data-format - Data format: \"NCHW\" or \"NHWC\" - `java.lang.String`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer block-size ^java.lang.String data-format]
    (-> this (.spaceToDepth name x block-size data-format)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer block-size ^java.lang.String data-format]
    (-> this (.spaceToDepth x block-size data-format))))

(defn cube
  "Element-wise cube function: out = x^3

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cube name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cube x))))

(defn exec-backwards
  "Execute the gradient (backward pass) function on this graph.
  Constructs a backwards graph (differentiating the defined graph) if it does not already exist, and the executes
  the operations on that graph, calculating gradients for all variables.
  Note that after execBackwards() has completed, the gradient arrays for a each variable can be accessed using
  SDVariable.getGradient() followed by SDVariable.getArr() or by using getGradForVariable(String)

  returns: Result of execution - `org.nd4j.linalg.primitives.Pair<java.util.Map<org.nd4j.autodiff.samediff.SDVariable,org.nd4j.autodiff.functions.DifferentialFunction>,java.util.List<org.nd4j.autodiff.functions.DifferentialFunction>>`"
  (^org.nd4j.linalg.primitives.Pair [^SameDiff this]
    (-> this (.execBackwards))))

(defn grad
  "Get the gradient for the variable with the specified variable name.
  Note that in order to run this function, execBackwards() must be executed first.
  All gradient functions are obtained from the results of the execBackwards call.

  var-name - the variable name to get the gradient variable for. - `java.lang.String`

  returns: The gradient variable for the specified variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String var-name]
    (-> this (.grad var-name))))

(defn norm-1
  "Norm1 (L1 norm) reduction operation: The output contains the L1 norm for each tensor/subset along the specified dimensions:
  out = sum_i abs(x[i])
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - dimensions to reduce over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm1 name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.norm1 name x dimensions))))

(defn add-property-for-function
  "Add a property for the given function

  function-for - the function add a property for - `org.nd4j.autodiff.functions.DifferentialFunction`
  property-name - the property name - `java.lang.String`
  property - the property value - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function-for ^java.lang.String property-name ^org.nd4j.linalg.api.ndarray.INDArray property]
    (-> this (.addPropertyForFunction function-for property-name property))))

(defn create-grad-function
  "Create the gradient function (for calculating gradients via execBackwards()) if it is not already defined.
  Users do not usually need to call this function manually, as it is called as required in the aforementioned method.

  If the gradient function already exists, this method is a no-op.
  After this method returns, the SameDiff function instance for the gradient can be accessed using getFunction(String)
  with name \"grad\" as the argument."
  ([^SameDiff this]
    (-> this (.createGradFunction))))

(defn update-variable-name
  "Update the opName for the variable
  with the given vertex id

  var-name - the vertex id to update - `java.lang.String`
  with-name - thew new opName - `java.lang.String`"
  ([^SameDiff this ^java.lang.String var-name ^java.lang.String with-name]
    (-> this (.updateVariableName var-name with-name))))

(defn sin
  "Elementwise sine operation: out = sin(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sin name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sin x))))

(defn print-function
  "Print the given function for debugging (will not print functions)

  differential-function - the function to print - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction differential-function]
    (-> this (.printFunction differential-function))))

(defn scalar-min
  "Element-wise scalar minimum operation: out = min(in, value)

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  value - Scalar value to compare - `java.lang.Number`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarMin name in value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarMin in value))))

(defn is-infinite
  "Is infinite operation: elementwise isInfinite(x)
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Output variable name - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isInfinite name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isInfinite x))))

(defn scatter-add
  "Scatter addition operation.
  If indices is rank 0 (a scalar), then out[index, ...] = updates[...]
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] = updates[i, ...]
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] = updates[i, ..., k, ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterAdd name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterAdd ref indices updates))))

(defn relu-layer
  "ReLU (Rectified Linear Unit) layer operation: out = relu(mmul(in,w)  bias)
  Note that bias array is optional

  name - Name of the output variable - `java.lang.String`
  input - Input data - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights variable - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional bias variable (may be null) - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.reluLayer name input weights bias)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.reluLayer input weights bias))))

(defn generate-output-variable-for-op
  "Generate the variables based on the given input op and return the output variable names.

  function - the function to generate the outputvariable names for - `org.nd4j.autodiff.functions.DifferentialFunction`
  base-name - `java.lang.String`

  returns: the set of names generated for each output of the function. - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function ^java.lang.String base-name]
    (-> this (.generateOutputVariableForOp function base-name)))
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.generateOutputVariableForOp function))))

(defn get-variable-arg-of-functions
  "Return a list of differential functions (if any) that this variable is the input argument for

  variable-name - Name of the variable - `java.lang.String`

  returns: The differential functions that this variable is an input argument for, or null if it is not the input to any function - `java.util.List<org.nd4j.autodiff.functions.DifferentialFunction>`"
  (^java.util.List [^SameDiff this ^java.lang.String variable-name]
    (-> this (.getVariableArgOfFunctions variable-name))))

(defn defined-function-names
  "The set of defined SameDiff function names. SameDiff function instances should not be confused
  with DifferentialFunction ops; an example of a SameDiff function instance is the gradient \"grad\" function

  returns: Set of defined SameDiff function instance names - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^SameDiff this]
    (-> this (.definedFunctionNames))))

(defn has-place-holder-variables?
  "Returns true if the given vertex id has any placeholder variables

  vertex-id - the vertex id to check for - `java.lang.String`

  returns: true if this vertex has any place holder variables or not - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String vertex-id]
    (-> this (.hasPlaceHolderVariables vertex-id))))

(defn match-condition-count
  "Returns a count of the number of elements that satisfy the condition (for each slice along the specified dimensions)
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dim - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Number of elements that the condition is satisfied for - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dim ^Integer dimensions]
    (-> this (.matchConditionCount name in condition keep-dim dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.matchConditionCount name in condition)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.matchConditionCount in condition))))

(defn loss-cosine-similarity
  "TODO doc string

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossCosineSimilarity x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossCosineSimilarity name x y dimensions))))

(defn eval
  "Evaluate the given inputs based on the current graph

  inputs - the inputs to evaluate - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^SameDiff this ^java.util.Map inputs]
    (-> this (.eval inputs))))

(defn memory-for-graph
  "Returns the number of bytes for the graph. Calculated as sum_i prod(shapeOf(variable[i]))

  returns: Bytes for all of the arrays in the graph for the current variable shapes - `long`"
  (^Long [^SameDiff this]
    (-> this (.memoryForGraph))))

(defn tile
  "Repeat (tile) the input tensor the specified number of times.
  For example, if input is
  [1, 2]
  [3, 4]
  and repeat is [2, 3]
  then output is
  [1, 2, 1, 2, 1, 2]
  [3, 4, 3, 4, 3, 4]
  [1, 2, 1, 2, 1, 2]
  [3, 4, 3, 4, 3, 4]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  repeat - Number of times to repeat in each axis. Must have length equal to the rank of the input array - `int[]`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x repeat]
    (-> this (.tile name x repeat)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x repeat]
    (-> this (.tile x repeat))))

(defn log-sigmoid
  "Element-wise sigmoid function: out[i] = log(sigmoid(in[i]))

  name - Name of the output variable - `java.lang.String`
  x - Input Variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.logSigmoid name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.logSigmoid x))))

(defn linear
  "Linear layer operation: out = mmul(in,w)  bias
  Note that bias array is optional

  name - Name of the output variable - `java.lang.String`
  input - Input data - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights variable - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional bias variable (may be null) - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.linear name input weights bias)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.linear input weights bias))))

(defn dynamic-stitch
  "Dynamically merge the specified input arrays into a single array, using the specified indices

  name - Name of the output variable - `java.lang.String`
  indices - Indices to use when merging. Must be >= 1, same length as input variables - `org.nd4j.autodiff.samediff.SDVariable[]`
  x - Input variables. - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: Merged output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name indices x]
    (-> this (.dynamicStitch name indices x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this indices x]
    (-> this (.dynamicStitch indices x))))

(defn col-2-im
  "col2im operation for use in 2D convolution operations. Outputs a 4d array with shape
  [minibatch, inputChannels, height, width]

  name - Name of the output variable - `java.lang.String`
  in - Input - rank 6 input with shape [minibatch, inputChannels, kernelHeight, kernelWidth, outputHeight, outputWidth] - `org.nd4j.autodiff.samediff.SDVariable`
  config - Convolution configuration for the col2im operation - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: Col2Im output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.col2Im name in config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.col2Im in config))))

(defn exp
  "Elementwise exponent function: out = exp(x) = 2.71828...^x

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.exp name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.exp x))))

(defn leaky-relu-derivative
  "Leaky ReLU derivative: dOut/dIn given input.
  See leakyRelu(String, SDVariable, double)

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  alpha - Alpha value - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double alpha]
    (-> this (.leakyReluDerivative name x alpha))))

(defn get-place-holders-for
  "Get the place holders for a given vertex id. May return null.

  Consider using hasPlaceHolderVariables(String)

  var-name - the vertex id to get the place holders for - `java.lang.String`

  returns: the place holder variables for the given vertex id or null - `java.util.List<java.lang.String[]>`"
  ([^SameDiff this ^java.lang.String var-name]
    (-> this (.getPlaceHoldersFor var-name))))

(defn or
  "Boolean OR operation: elementwise (x != 0) || (y != 0)
  If x and y arrays have equal shape, the output shape is the same as these inputs.
  Note: supports broadcasting if x and y have different shapes and are broadcastable.
  Returns an array with values 1 where condition is satisfied, or value 0 otherwise.

  name - Name of the output variable - `java.lang.String`
  x - Input 1 - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input 2 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.or name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.or x y))))

(defn identity
  "Elementwise identity operation: out = x

  name - name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.identity name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.identity input))))

(defn get-output-variables-for-function
  "Get the output variable(s) for the specified differential function

  function - the function reference to get the output variable(s) for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the output variables for the given function - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getOutputVariablesForFunction function))))

(defn eye
  "Generate an identity matrix with the specified number of rows and columns, with optional leading dims
  Example:
  batchShape: [3,3]
  numRows: 2
  numCols: 4
  returns a tensor of shape (3, 3, 2, 4) that consists of 3 * 3 batches of (2,4)-shaped identity matrices:
  1 0 0 0
  0 1 0 0

  name - `java.lang.String`
  rows - Number of rows - `int`
  cols - Number of columns - `int`
  batch-dimension - Batch dimensions. May be null - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer rows ^Integer cols ^Integer batch-dimension]
    (-> this (.eye name rows cols batch-dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer rows ^Integer cols]
    (-> this (.eye name rows cols)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer rows]
    (-> this (.eye name rows)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Integer rows]
    (-> this (.eye rows))))

(defn neg
  "Elementwise negative operation: out = -x

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.neg name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.neg x))))

(defn get-list-by-name
  "name - `java.lang.String`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^SameDiff this ^java.lang.String name]
    (-> this (.getListByName name))))

(defn entropy
  "Entropy reduction: -sum(x * log(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce on (null/empty for full array) - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.entropy name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.entropy in dimensions))))

(defn fill
  "Generate an output variable with the specified (dynamic) shape with all elements set to the specified value

  name - Name of the output variable - `java.lang.String`
  shape - Shape: must be a 1D array/variable - `org.nd4j.autodiff.samediff.SDVariable`
  value - Value to set all elements to - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable shape ^Double value]
    (-> this (.fill name shape value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable shape ^Double value]
    (-> this (.fill shape value))))

(defn properties-to-resolve-for-function
  "Return the properties to resolve for the given function.
  This is typically used right before execution in model import in
  DifferentialFunction.resolvePropertiesFromSameDiffBeforeExecution()

  function - the function get the properties to resolve for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the properties to resolve for the given function - `java.util.List<java.lang.String>`"
  (^java.util.List [^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.propertiesToResolveForFunction function))))

(defn scalar-set
  "Return an arary with equal shape to the input, but all elements set to value 'set'

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  set - Value to set - `java.lang.Number`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number set]
    (-> this (.scalarSet name in set)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number set]
    (-> this (.scalarSet in set))))

(defn softsign
  "Element-wise softsign function: out = x / (abs(x)  1)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softsign name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softsign x))))

(defn scatter-update
  "Scatter update operation.
  If indices is rank 0 (a scalar), then out[index, ...] = updates[...]
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] = updates[i, ...]
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] = updates[i, ..., k, ...]
  Note that if multiple indices refer to the same location, the output at those locations is undefined - different
  updates may occur in different orders

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterUpdate name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterUpdate ref indices updates))))

(defn get-arr-for-var-name
  "Get an INDArray for a given vertex id, or null if none exists

  var-name - Variable name to get the array for - `java.lang.String`

  returns: Array, or null if none exists - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this ^java.lang.String var-name]
    (-> this (.getArrForVarName var-name))))

(defn get-variable-output-function
  "Get the differential function (if any) that this variable is the output for

  variable-name - Name of the variable - `java.lang.String`

  returns: The differential function that this variable is an output of, or null if it is not the output of a function - `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^SameDiff this ^java.lang.String variable-name]
    (-> this (.getVariableOutputFunction variable-name))))

(defn erf
  "Element-wise Gaussian error function - out = erf(in)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.erf name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.erf x))))

(defn update-array-for-var-name
  "Update the INDArray for the given variable. Note that the array must exist to use this method.

  var-name - Name of the variable to update the array for - `java.lang.String`
  arr - Array to update - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.nd4j.linalg.exception.ND4JIllegalStateException - when the array does not exist."
  ([^SameDiff this ^java.lang.String var-name ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.updateArrayForVarName var-name arr))))

(defn replace-where
  "Element-wise replace where condition:
  out[i] = from[i] if condition(update[i]) is satisfied, or
  out[i] = update[i] if condition(update[i]) is NOT satisfied

  name - Name of the output variable - `java.lang.String`
  update - Source array - `org.nd4j.autodiff.samediff.SDVariable`
  from - Replacement values array (used conditionally). Must be same shape as 'update' array - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition to check on update array elements - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: New array with values replaced where condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable update ^org.nd4j.autodiff.samediff.SDVariable from ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere name update from condition)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable update ^org.nd4j.autodiff.samediff.SDVariable from ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere update from condition))))

(defn merge-add
  "Merge add function: merges an arbitrary number of equal shaped arrays using element-wise addition:
  out = sum_i in[i]

  name - Name of the output variable - `java.lang.String`
  inputs - Input variables - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.mergeAdd name inputs)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.mergeAdd x))))

(defn sconv-2d
  "Separable 2D convolution operation with/without optional bias

  name - name of the output variable - `java.lang.String`
  inputs - the inputs to separable conv2 operation. Should be length 3 (layerInput, depthWeights, pointWeights)or length 4 (layerInput, depthWeights, pointWeights, bias) as described in separableConv2d(SDVariable, SDVariable, SDVariable, SDVariable, Conv2DConfig) - `org.nd4j.autodiff.samediff.SDVariable[]`
  conv-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: result of separable convolution 2d operation - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (-> this (.sconv2d name inputs conv-2-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (-> this (.sconv2d inputs conv-2-d-config))))

(defn conv-2d
  "2D Convolution operation with optional bias

  layer-input - the input to max pooling 2d operation - 4d CNN (image) activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights for the convolution operation. 4 dimensions.If layer input data is in NCHW format, weights should have format [outputChannels, inputChannels, kernelHeight, kernelWidth].If layer input data is in NHWC format, weight should have format [kernelHeight, kernelWidth, inputChannels, outputChannels] - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional 1D bias array with shape [outputChannels]. May be null. - `org.nd4j.autodiff.samediff.SDVariable`
  config - Conv2DConfig configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: result of conv2d op - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.conv2d layer-input weights bias config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.conv2d layer-input weights config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.conv2d inputs config))))

(defn sqrt
  "Element-wise square root function: out = sqrt(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sqrt name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sqrt x))))

(defn concat
  "Concatenate a set of inputs along the specified dimension.
  Note that inputs must have identical rank and identical dimensions, other than the dimension to stack on.
  For example, if 2 inputs have shape [a, x, c] and [a, y, c] and dimension = 1, then the output has shape [a, x+y, c]

  name - Name of the output variable - `java.lang.String`
  dimension - Dimension to concatenate on - `int`
  inputs - Input variables - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer dimension ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.concat name dimension inputs)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Integer dimension ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.concat dimension inputs))))

(defn functions
  "Get an array of differential functions that have been defined for this SameDiff instance

  returns: Array of differential functions - `org.nd4j.autodiff.functions.DifferentialFunction[]`"
  ([^SameDiff this]
    (-> this (.functions))))

(defn batch-mmul
  "Matrix multiply a batch of matrices. matricesA and matricesB have to be arrays of same
  length and each pair taken from these sets has to have dimensions (M, N) and (N, K),
  respectively. If transposeA is true, matrices from matricesA will have shape (N, M) instead.
  Likewise, if transposeB is true, matrices from matricesB will have shape (K, N).
  The result of this operation will be a batch of multiplied matrices. The
  result has the same length as both input batches and each output matrix is of shape (M, K).

  names - names for all provided SDVariables - `java.lang.String[]`
  matrices-a - First array of input matrices, all of shape (M, N) or (N, M) - `org.nd4j.autodiff.samediff.SDVariable[]`
  matrices-b - Second array of input matrices, all of shape (N, K) or (K, N) - `org.nd4j.autodiff.samediff.SDVariable[]`
  transpose-a - whether first batch of matrices is transposed. - `boolean`
  transpose-b - whether second batch of matrices is transposed. - `boolean`

  returns: Array of multiplied SDVariables of shape (M, K) - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this names matrices-a matrices-b ^Boolean transpose-a ^Boolean transpose-b]
    (-> this (.batchMmul names matrices-a matrices-b transpose-a transpose-b)))
  ([^SameDiff this matrices-a matrices-b ^Boolean transpose-a ^Boolean transpose-b]
    (-> this (.batchMmul matrices-a matrices-b transpose-a transpose-b)))
  ([^SameDiff this matrices-a matrices-b]
    (-> this (.batchMmul matrices-a matrices-b))))

(defn num-elements
  "Count the number of elements in all arrays, according to SDVariable.getShape()

  returns: Number of array elements for all variables - `long`"
  (^Long [^SameDiff this]
    (-> this (.numElements))))

(defn as-flat-buffers
  "This method exports the current SameDiff instance into FlatBuffers format, returning the array ops and
  all arrays as a ByteBuffer containing the FlatBuffers format data

  configuration - - ExecutorConfiguration to be embedded into serialized graph - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  returns: a ByteBuffer holding the exported FlatBuffers representation of the graph - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^SameDiff this ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.asFlatBuffers configuration)))
  (^java.nio.ByteBuffer [^SameDiff this]
    (-> this (.asFlatBuffers))))

(defn get-inputs-for-function
  "Returns the name(s) of the inputs for the given function

  function - the function to get the inputs for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the input ids for a given function - `java.lang.String[]`"
  ([^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getInputsForFunction function))))

(defn scatter-mul
  "Scatter multiplication operation.
  If indices is rank 0 (a scalar), then out[index, ...] *= updates[...]
  If indices is rank 1 (a vector), then for each position i, out[indices[i], ...] *= updates[i, ...]
  If indices is rank 2+, then for each position (i,...,k), out[indices[i], ..., indices[k], ...] *= updates[i, ..., k, ...]
  Note that if multiple indices refer to the same location, the contributions from each is handled correctly.

  name - Name of the output variable - `java.lang.String`
  ref - Initial/source variable - `org.nd4j.autodiff.samediff.SDVariable`
  indices - Indices array - `org.nd4j.autodiff.samediff.SDVariable`
  updates - Updates to add to the initial/source array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: The updated variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMul name ref indices updates)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMul ref indices updates))))

(defn is-strictly-increasing
  "Is the array strictly increasing?
  An array is strictly increasing if for every valid i, x[i] < x[i+1]. For Rank 2+ arrays, values are compared
  in 'c' (row major) order

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Scalar variable with value 1 if strictly increasing, or 0 otherwise - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isStrictlyIncreasing name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isStrictlyIncreasing x))))

(defn variables
  "The list of all variables in the graph

  returns: All variables in the graph - `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SameDiff this]
    (-> this (.variables))))

(defn yet-another-exec-method
  "inputs - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this ^java.util.Map inputs]
    (-> this (.yetAnotherExecMethod inputs))))

(defn norm-2
  "Norm2 (L2 norm) reduction operation: The output contains the L2 norm for each tensor/subset along the specified dimensions:
  out = sqrt(sum_i x[i]^2)
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - dimensions to reduce over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm2 name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.norm2 name x dimensions))))

(defn is-max
  "Is maximum operation: elementwise x == max(x)
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isMax name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isMax x))))

(defn tan
  "Elementwise tangent operation: out = tan(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.tan name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.tan x))))

(defn exec-backward-and-end-result
  "Exec a backwards operation and return the end result

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this]
    (-> this (.execBackwardAndEndResult))))

(defn cos
  "Elementwise cosine operation: out = cos(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cos name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.cos x))))

(defn put-or-update-array-for-var-name
  "Put the array if it does not exist for the given variable name, or update it if it does

  var-name - Variable name - `java.lang.String`
  arr - Array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiff this ^java.lang.String var-name ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.putOrUpdateArrayForVarName var-name arr))))

(defn merge-max
  "Merge max function: merges an arbitrary number of equal shaped arrays using element-wise maximum operation:
  out = max_i in[i]

  name - `java.lang.String`
  inputs - Input variables - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.mergeMax name inputs)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.mergeMax x))))

(defn get-shape-for-var-name
  "Get the shape for the given vertex id.
  Note that if an array is defined, it will use the shape of the array instead.

  A shape *and* an array should not be defined at the same time.
  This wastes memory. The internal map used for tracking shapes for particular
  vertex ids should also delete redundant shapes stored to avoid redundant sources of information.

  var-name - the vertex id to get the shape for - `java.lang.String`

  returns: the shape for the given vertex if if any. - `long[]`"
  ([^SameDiff this ^java.lang.String var-name]
    (-> this (.getShapeForVarName var-name))))

(defn scalar-max
  "Element-wise scalar maximum operation: out = max(in, value)

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  value - Scalar value to compare - `java.lang.Number`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarMax name in value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarMax in value))))

(defn remove-arg-from-function
  "Remove an argument for a function. Note that if this function does not contain the argument, it will just be a no op.

  var-name - the variable name to remove - `java.lang.String`
  function - the function to remove the argument from - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this ^java.lang.String var-name ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.removeArgFromFunction var-name function))))

(defn enable-debug-mode
  "Enables tracing of graphs automatically.

  returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^SameDiff this]
    (-> this (.enableDebugMode))))

(defn match-condition
  "Returns a boolean mask of equal shape to the input, where the condition is satisfied - value 1 where satisfied, 0 otherwise

  name - `java.lang.String`
  in - Input - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Boolean mask - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.matchCondition name in condition)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.matchCondition in condition))))

(defn avg-pooling-3d
  "3D convolution layer operation - average pooling 3d

  name - name of the operation in SameDiff - `java.lang.String`
  input - the input to average pooling 3d operation - 5d activations in NCDHW format(shape [minibatch, channels, depth, height, width]) or NDHWC format(shape [minibatch, depth, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`

  returns: Result after applying average pooling on the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.avgPooling3d name input pooling-3-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.avgPooling3d input pooling-3-d-config))))

(defn and
  "Boolean AND operation: elementwise (x != 0) && (y != 0)
  If x and y arrays have equal shape, the output shape is the same as these inputs.
  Note: supports broadcasting if x and y have different shapes and are broadcastable.
  Returns an array with values 1 where condition is satisfied, or value 0 otherwise.

  name - Name of the output variable - `java.lang.String`
  x - Input 1 - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input 2 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.and name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.and x y))))

(defn one-hot
  "Convert the array to a one-hot array with walues on and off for each entry
  If input has shape [ a, ..., n] then output has shape [ a, ..., n, depth],
  with out[i, ..., j, in[i,...,j]] = on with other values being set to off

  name - Output variable name - `java.lang.String`
  indices - Indices - value 0 to depth-1 - `org.nd4j.autodiff.samediff.SDVariable`
  depth - Number of classes - `int`
  axis - `int`
  on - `double`
  off - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth ^Integer axis ^Double on ^Double off]
    (-> this (.oneHot name indices depth axis on off)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth]
    (-> this (.oneHot name indices depth)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth ^Integer axis ^Double on ^Double off]
    (-> this (.oneHot indices depth axis on off)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth]
    (-> this (.oneHot indices depth))))

(defn shannon-entropy
  "Shannon Entropy reduction: -sum(x * log2(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce on (null/empty for full array) - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.shannonEntropy name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.shannonEntropy in dimensions))))

(defn sequence-mask
  "Generate a sequence mask (with values 0 or 1) based on the specified lengths
  Specifically, out[i, ..., k, j] = (j < lengths[i, ..., k] ? 1.0 : 0.0)

  name - Name of the output variable - `java.lang.String`
  lengths - Lengths of the sequences - `org.nd4j.autodiff.samediff.SDVariable`
  max-len - Maximum sequence length - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable lengths ^org.nd4j.autodiff.samediff.SDVariable max-len]
    (-> this (.sequenceMask name lengths max-len)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable lengths ^org.nd4j.autodiff.samediff.SDVariable max-len]
    (-> this (.sequenceMask lengths max-len)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable lengths]
    (-> this (.sequenceMask lengths))))

(defn sigmoid-cross-entropy-with-logits
  "TODO

  name - `java.lang.String`
  logits - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  reduction-mode - `int`
  label-smoothing - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.sigmoidCrossEntropyWithLogits name logits weights labels reduction-mode label-smoothing)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.sigmoidCrossEntropyWithLogits logits weights labels reduction-mode label-smoothing))))

(defn asum
  "Absolute sum array reduction operation, optionally along specified dimensions: out = sum(abs(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.asum name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.asum in dimensions))))

(defn update-variable
  "Update the INDArray
  ndarray for the given variable name

  variable-name - the variable to update - `java.lang.String`
  arr - the array to update with - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiff this ^java.lang.String variable-name ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.updateVariable variable-name arr))))

(defn local-response-normalization
  "2D convolution layer operation - local response normalization

  name - name of the operation in SameDiff - `java.lang.String`
  input - the inputs to lrn - `org.nd4j.autodiff.samediff.SDVariable`
  lrn-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig lrn-config]
    (-> this (.localResponseNormalization name input lrn-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig lrn-config]
    (-> this (.localResponseNormalization inputs lrn-config))))

(defn square
  "Element-wise square function: out = x^2

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.square name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.square x))))

(defn import-variable?
  "Returns true if the variable name is imported

  variable-name - the imported variable name - `java.lang.String`

  returns: true if the name is imported, false otherwise - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String variable-name]
    (-> this (.isImportVariable variable-name))))

(defn set-gradient-for-variable-name
  "Assign a SDVariable to represent the gradient of the SDVariable with the specified name

  variable-name - the variable name to assign the gradient variable for - `java.lang.String`
  variable - the gradient variable - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^SameDiff this ^java.lang.String variable-name ^org.nd4j.autodiff.samediff.SDVariable variable]
    (-> this (.setGradientForVariableName variable-name variable))))

(defn add-args-for
  "Adds incoming arguments for the specified differential function to the graph

  variables - Name of the variables that are arguments (inputs) to the specified function - `java.lang.String[]`
  function - Function - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this variables ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.addArgsFor variables function))))

(defn expand-dims
  "Reshape the input by adding a 1 at the specified location.
  For example, if input has shape [a, b], then output shape is:
  axis = 0: [1, a, b]
  axis = 1: [a, 1, b]
  axis = 2: [a, b, 1]

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  axis - Axis to expand - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.expandDims name x axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (-> this (.expandDims x axis))))

(defn loss-poisson
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossPoisson name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossPoisson x y dimensions))))

(defn softmax
  "Softmax activation

  name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softmax name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softmax x))))

(defn random-uniform
  "Generate a new random SDVariable, where values are randomly sampled according to a uniform distribution,
  U(min,max)
  See randomUniform(double, double, long...) for the equivalent function where the shape is
  specified as a long[] instead

  name - Name of the new SDVariable - `java.lang.String`
  min - Minimum value - `double`
  max - Maximum value. Must satisfy max >= min - `double`
  shape - Shape of the new random SDVariable, as a 1D array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double min ^Double max ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomUniform name min max shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double min ^Double max ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomUniform min max shape))))

(defn put-array-for-var-name
  "Adds an INDArray for a given variable name.
  Use updateArrayForVarName(String, INDArray) if the array already exists.

  var-name - the vertex id to add - `java.lang.String`
  arr - the array to add - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.nd4j.linalg.exception.ND4JIllegalStateException - when the array already exists."
  ([^SameDiff this ^java.lang.String var-name ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.putArrayForVarName var-name arr))))

(defn strided-slice
  "Get a subset of the specified input, by specifying the first element, last element, and the strides.
  Operates as described in stridedSlice(SDVariable, long[], long[], long[]) with some extra mask arrays
  as described below.

  name - Output variable name - `java.lang.String`
  in - Variable to get subset of - `org.nd4j.autodiff.samediff.SDVariable`
  begin - Beginning index - `long[]`
  end - End index - `long[]`
  strides - Stride (\"step size\") for each dimension. For example,stride of 2 means take every second element. - `long[]`
  begin-mask - Bit mask: If the ith bit is set to 1, then the value in the begin long[] is ignored,and a value of 0 is used instead for the beginning index for that dimension - `int`
  end-mask - Bit mask: If the ith bit is set to 1, then the value in the end long[] is ignored,and a value of size(i)-1 is used instead for the end index for that dimension - `int`
  ellipsis-mask - Bit mask: only one non-zero value is allowed here. If a non-zero value is set, then otherdimensions are inserted as required at the specified position - `int`
  new-axis-mask - Bit mask: if the ith bit is set to 1, then the begin/end/stride values are ignored, anda size 1 dimension is inserted at this point - `int`
  shrink-axis-mask - Bit mask: if the ith bit is set to 1, then the begin/end/stride values are ignored, anda size 1 dimension is removed at this point. Note that begin/end/stride values mustresult in a size 1 output for these dimensions - `int`

  returns: A subset of the input array - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (-> this (.stridedSlice name in begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input begin end strides]
    (-> this (.stridedSlice name input begin end strides)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (-> this (.stridedSlice in begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input begin end strides]
    (-> this (.stridedSlice input begin end strides))))

(defn abs
  "Elementwise absolute value operation: out = abs(x)

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.abs name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.abs x))))

(defn one
  "Create a new variable with the specified shape, with all values initialized to 1.0

  name - the name of the variable to create - `java.lang.String`
  shape - the shape of the array to be created - `int[]`

  returns: the created variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name shape]
    (-> this (.one name shape))))

(defn exec-with-place-holder-and-end-result
  "Creates and executes a list of operations

  inputs - `java.util.Map`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiff this ^java.util.Map inputs]
    (-> this (.execWithPlaceHolderAndEndResult inputs))))

(defn is-na-n
  "Is Not a Number operation: elementwise isNaN(x)
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Output variable name - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNaN name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isNaN x))))

(defn avg-pooling-2d
  "2D Convolution layer operation - average pooling 2d

  name - name of the operation in SameDiff - `java.lang.String`
  input - the input to average pooling 2d operation - 4d CNN (image) activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`

  returns: Result after applying average pooling on the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.avgPooling2d name input pooling-2-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.avgPooling2d input pooling-2-d-config))))

(defn loss-l-2
  "L2 loss

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossL2 x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossL2 name x y dimensions))))

(defn count-zero
  "Count zero array reduction operation, optionally along specified dimensions: out = count(x == 0)

  name - Name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countZero name input dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countZero input dimensions))))

(defn function-exists
  "Returns true if the given function id exists

  id - the function id to test for - `java.lang.String`

  returns: true if the function id exists, false otherwise - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String id]
    (-> this (.functionExists id))))

(defn put-or-update-shape-for-var-name
  "Put or update the shape for the given variable name. Optionally supports clearing the specified variable's
  INDArray if it's shape does not match the new shape

  var-name - Variable name - `java.lang.String`
  shape - Shape to put - `long[]`
  clear-array-on-shape-mismatch - If false: no change to arrays. If true: if an INDArray is defined for the specifiedvariable name, it will be removed from the graph (to be later re-generated) ifits shape does not match the specified shape - `boolean`"
  ([^SameDiff this ^java.lang.String var-name shape ^Boolean clear-array-on-shape-mismatch]
    (-> this (.putOrUpdateShapeForVarName var-name shape clear-array-on-shape-mismatch))))

(defn expm-1
  "Elementwise 1.0 - exponent function: out = 1.0 - exp(x) = 1.0 - 2.71828...^x

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.expm1 name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.expm1 x))))

(defn disable-debugging
  "Clears debugging state and disables debug mode.

  returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^SameDiff this]
    (-> this (.disableDebugging))))

(defn log-sum-exp
  "Log-sum-exp reduction (optionally along dimension).
  Computes log(sum(exp(x))

  name - Name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Optional dimensions to reduce along - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.logSumExp name input dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.logSumExp input dimensions))))

(defn relu
  "Element-wise rectified linear function with specified cutoff:
  out[i] = in[i] if in[i] >= cutoff
  out[i] = 0 otherwise

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - Cutoff value. Usually 0 - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double cutoff]
    (-> this (.relu name x cutoff)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double cutoff]
    (-> this (.relu x cutoff))))

(defn add-outgoing-for
  "Adds outgoing arguments to the graph for the specified DifferentialFunction
  Also checks for input arguments and updates the graph adding an appropriate edge when the full graph is declared.

  variables - Variables - arguments for the specified differential function - `org.nd4j.autodiff.samediff.SDVariable[]`
  function - Differential function - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^SameDiff this variables ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.addOutgoingFor variables function))))

(defn all-place-holder-variables-resolved
  "Returns true if all place holder variables are resolved.
  A place holder variable is resolved when getVariable(String) getArr() does not return null and
  the shape is properly resolved.

  returns: true if all place holder variables are resolved. - `boolean`"
  (^Boolean [^SameDiff this]
    (-> this (.allPlaceHolderVariablesResolved))))

(defn slice
  "Get a subset of the specified input, by specifying the first element and the size of the array.
  For example, if input is:
  [a, b, c]
  [d, e, f]
  then slice(input, begin=[0,1], size=[2,1] will return:
  [b]
  [e]

  Note that for each dimension i, begin[i]  size[i] <= input.size(i)

  name - Output variable name - `java.lang.String`
  input - Variable to get subset of - `org.nd4j.autodiff.samediff.SDVariable`
  begin - Beginning index. Must be same length as rank of input array - `int[]`
  size - Size of the output array. Must be same length as rank of input array - `int[]`

  returns: Subset of the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input begin size]
    (-> this (.slice name input begin size)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input begin size]
    (-> this (.slice input begin size))))

(defn has-args?
  "Returns true if this function already has defined arguments

  function - the function to check - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: true if the function has args, false otherwise - `boolean`"
  (^Boolean [^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.hasArgs function))))

(defn clip-by-norm
  "Clipping by L2 norm, optionally along dimension(s)
  if l2Norm(x,dimension) < clipValue, then input is returned unmodifed
  Otherwise, out[i] = in[i] * clipValue / l2Norm(in, dimensions) where each value is clipped according
  to the corresponding l2Norm along the specified dimensions

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  clip-value - Clipping value (maximum l2 norm) - `double`
  dimensions - If not specified, all dimensions are used - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value ^Integer dimensions]
    (-> this (.clipByNorm name x clip-value dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value]
    (-> this (.clipByNorm name x clip-value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value]
    (-> this (.clipByNorm x clip-value))))

(defn merge-avg
  "Merge average function: merges an arbitrary number of equal shaped arrays using element-wise mean operation:
  out = mean_i in[i]

  name - Name of the output variable - `java.lang.String`
  inputs - Input variables - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.mergeAvg name inputs)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.mergeAvg inputs))))

(defn lte
  "Less than or equals operation: elementwise x <= y
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Name of the output variable - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`
  y - Double value argument to use in operation - `double`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.lte name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Double y]
    (-> this (.lte x y))))

(defn dilation-2-d
  "TODO doc string

  name - `java.lang.String`
  df - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  strides - `int[]`
  rates - `int[]`
  is-same-mode - `boolean`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable weights strides rates ^Boolean is-same-mode]
    (-> this (.dilation2D name df weights strides rates is-same-mode)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable weights strides rates ^Boolean is-same-mode]
    (-> this (.dilation2D df weights strides rates is-same-mode))))

(defn is-finite
  "Is finite operation: elementwise isFinite(x)
  Returns an array with the same shape/size as the input, with values 1 where condition is satisfied, or
  value 0 otherwise

  name - Output variable name - `java.lang.String`
  x - Input array - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isFinite name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.isFinite x))))

(defn tensor-mmul
  "name - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - dimensions - `int[][]`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y dimensions]
    (-> this (.tensorMmul name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y dimensions]
    (-> this (.tensorMmul x y dimensions))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SameDiff this]
    (-> this (.hashCode))))

(defn segment-max
  "Segment max operation.
  If data = [3, 6, 1, 4, 9, 2, 8]
  segmentIds = [0, 0, 1, 1, 1, 2, 2]
  then output = [6, 9, 8] = [max(3,6), max(1,4,9), max(2,8)

  name - Name of the output variable. May be null - `java.lang.String`
  data - Data to perform segment max on - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - Variable for the segment IDs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Segment max output - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMax name data segment-ids)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMax data segment-ids))))

(defn update-shape-for-var-name
  "Update a vertex id with the given shape.
  Note that you should use putShapeForVarName(String, long[]) if you want to add a new shape.
  Update is meant to be an in place replacement of the shape for the vertex id *only*.

  var-name - the vertex id to associate - `java.lang.String`
  shape - the shape to associate with - `long[]`
  clear-array-on-shape-mismatch - boolean to indicate whether to clear the variable on shape mismatch - `boolean`"
  ([^SameDiff this ^java.lang.String var-name shape ^Boolean clear-array-on-shape-mismatch]
    (-> this (.updateShapeForVarName var-name shape clear-array-on-shape-mismatch)))
  ([^SameDiff this ^java.lang.String var-name shape]
    (-> this (.updateShapeForVarName var-name shape))))

(defn get-var-name-for-field-and-function
  "Get the variable name to use
  for resolving a given field
  for a given function during import time.
  This method is u sed during DifferentialFunction.resolvePropertiesFromSameDiffBeforeExecution()

  function - the function to get the variable name for - `org.nd4j.autodiff.functions.DifferentialFunction`
  field-name - the field name to resolve for - `java.lang.String`

  returns: the resolve variable name if any - `java.lang.String`"
  (^java.lang.String [^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function ^java.lang.String field-name]
    (-> this (.getVarNameForFieldAndFunction function field-name))))

(defn variance
  "Variance array reduction operation, optionally along specified dimensions
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - If true: divide by (N-1) (i.e., sample variable). If false: divide by N (population variance) - `boolean`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.variance name x bias-corrected keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.variance name x bias-corrected dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean bias-corrected ^Integer dimensions]
    (-> this (.variance x bias-corrected dimensions))))

(defn clear-execution-cache
  "Clear the execution cache, if it is present"
  ([^SameDiff this]
    (-> this (.clearExecutionCache))))

(defn amax
  "Absolute max array reduction operation, optionally along specified dimensions: out = max(abs(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amax name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amax in dimensions))))

(defn loss-binary-xent
  "Binary cross entropy loss.

  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Reduction dimensions - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossBinaryXENT x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossBinaryXENT name x y dimensions))))

(defn atanh
  "Elementwise atanh (inverse hyperbolic tangent) function: out = atanh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atanh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atanh x))))

(defn size
  "Returns the size (number of elements, i.e., prod(shape)) of the specified SDVariable as a 0D scalar variable

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: 0D (scalar) output variable with value equal to the number of elements in the specified array - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.size name in)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.size in))))

(defn segment-min
  "Segment min operation.
  If data = [3, 6, 1, 4, 9, 2, 8]
  segmentIds = [0, 0, 1, 1, 1, 2, 2]
  then output = [3, 1, 2] = [min(3,6), min(1,4,9), min(2,8)

  name - Name of the output variable. May be null - `java.lang.String`
  data - Data to perform segment max on - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - Variable for the segment IDs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Segment min output - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMin name data segment-ids)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMin data segment-ids))))

(defn amin
  "Absolute min array reduction operation, optionally along specified dimensions: out = min(abs(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amin name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amin in dimensions))))

(defn dropout
  "name - `java.lang.String`
  input - Input - `org.nd4j.autodiff.samediff.SDVariable`
  input-retain-probability - Probability of retaining an input (set to 0 with probability 1-p) - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Double input-retain-probability]
    (-> this (.dropout name input input-retain-probability)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Double input-retain-probability]
    (-> this (.dropout input input-retain-probability))))

(defn upsampling-2d
  "2D Convolution layer operation - Upsampling 2d

  name - `java.lang.String`
  input - Input, in NCHW format - `org.nd4j.autodiff.samediff.SDVariable`
  nchw - If true: input is in NCHW (minibatch, channels, height, width) format. False: NHWC format - `boolean`
  scale-h - Scale to upsample in height dimension - `int`
  scale-w - Scale to upsample in width dimension - `int`

  returns: Upsampled input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (-> this (.upsampling2d name input nchw scale-h scale-w)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (-> this (.upsampling2d input nchw scale-h scale-w)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^Integer scale]
    (-> this (.upsampling2d name input scale)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer scale]
    (-> this (.upsampling2d input scale))))

(defn loss-negative-log-likelihood
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossNegativeLogLikelihood name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossNegativeLogLikelihood x y dimensions))))

(defn amean
  "Absolute mean array reduction operation, optionally along specified dimensions: out = mean(abs(x))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce over. If dimensions are not specified, full array reduction is performed - `int`

  returns: Reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amean name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amean in dimensions))))

(defn sinh
  "Elementwise sinh (hyperbolic sine) operation: out = sinh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sinh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sinh x))))

(defn dup
  "Clone/duplicate the SameDiff instance, including arrays etc. The returned SameDiff instance should have no
  shared state with the original instance

  returns: The cloned SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^SameDiff this]
    (-> this (.dup))))

(defn put-sub-function
  "Associate a SameDiff namespace as a sub function.

  name - the opName of the function - `java.lang.String`
  name-space - the namespace - `org.nd4j.autodiff.samediff.SameDiff`"
  ([^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff name-space]
    (-> this (.putSubFunction name name-space))))

(defn softplus
  "Element-wise softplus function: out = log(exp(x)  1)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softplus name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.softplus x))))

(defn asinh
  "Elementwise asinh (inverse hyperbolic sine) function: out = asinh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.asinh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.asinh x))))

(defn while-statement
  "Creates a while statement

  same-diff-conditional - `org.nd4j.autodiff.samediff.SameDiffConditional`
  condition-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  loop-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  input-vars - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.linalg.api.ops.impl.controlflow.While`"
  (^org.nd4j.linalg.api.ops.impl.controlflow.While [^SameDiff this ^org.nd4j.autodiff.samediff.SameDiffConditional same-diff-conditional ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition condition-body ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition loop-body input-vars]
    (-> this (.whileStatement same-diff-conditional condition-body loop-body input-vars))))

(defn zero-fraction
  "Full array zero fraction array reduction operation, optionally along specified dimensions: out = (count(x == 0) / length(x))

  name - Name of the output variable - `java.lang.String`
  input - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Reduced array of rank 0 (scalar) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zeroFraction name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zeroFraction input))))

(defn cumsum
  "Cumulative sum operation.
  For input: [ a, b, c], output is:
  exclusize=false, reverse=false: [a, a+b, a+b+c]
  exclusive=true, reverse=false, [0, a, a+b]
  exclusive=false, reverse=true: [a+b+c, b+c, c]
  exclusive=true, reverse=true: [b+c, c, 0]

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - If true: exclude the first value - `boolean`
  reverse - If true: reverse the direction of the accumulation - `boolean`
  axis - Scalar axis argument for dimension to perform cumululative sum operations along - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumsum name in exclusive reverse axis)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumsum in exclusive reverse axis))))

(defn random-exponential
  "Generate a new random SDVariable, where values are randomly sampled according to a exponential distribution:
  P(x) = lambda * exp(-lambda * x)

  name - Name of the output variable - `java.lang.String`
  lambda - Must be > 0 - `double`
  shape - Shape of the new variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: new SDVaribale - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double lambda ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomExponential name lambda shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double lambda ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomExponential lambda shape))))

(defn round
  "Element-wise round function: out = round(x).
  Rounds (up or down depending on value) to the nearest integer value.

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.round name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.round x))))

(defn max-pooling-2d
  "2D Convolution layer operation - max pooling 2d

  name - name of the operation in SameDiff - `java.lang.String`
  input - the input to max pooling 2d operation - 4d CNN (image) activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`

  returns: Result after applying max pooling on the input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.maxPooling2d name input pooling-2-d-config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.maxPooling2d input pooling-2-d-config))))

(defn segment-prod
  "Segment product operation.
  If data = [3, 6, 1, 4, 9, 2, 8]
  segmentIds = [0, 0, 1, 1, 1, 2, 2]
  then output = [18, 36, 16] = [prod(3,6), prod(1,4,9), prod(2,8)

  name - Name of the output variable. May be null - `java.lang.String`
  data - Data to perform segment max on - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - Variable for the segment IDs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Segment product output - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentProd name data segment-ids)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentProd data segment-ids))))

(defn loss-squared-hinge
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossSquaredHinge name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossSquaredHinge x y dimensions))))

(defn scalar-floor-mod
  "Element-wise scalar floor modulus operation: out = floorMod(in, value).
  i.e., returns the remainder after division by 'value'

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  value - Scalar value to compare - `java.lang.Number`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarFloorMod name in value)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number value]
    (-> this (.scalarFloorMod in value))))

(defn update-variable-names-and-references
  "Updates the variable name property on the passed in variables, its reference in samediff, and returns the variable.

  variables-to-update - the variable to update - `org.nd4j.autodiff.samediff.SDVariable[]`
  new-variable-names - the new variable name - `java.lang.String[]`

  returns: the updated, passed in variables - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this variables-to-update new-variable-names]
    (-> this (.updateVariableNamesAndReferences variables-to-update new-variable-names))))

(defn associate-array-with-variable
  "Associate the array with the given variable.

  arr - the array to get the variable for - `org.nd4j.linalg.api.ndarray.INDArray`
  variable - the name of the variable to associate the array with - `java.lang.String`"
  ([^SameDiff this ^org.nd4j.linalg.api.ndarray.INDArray arr ^java.lang.String variable]
    (-> this (.associateArrayWithVariable arr variable))))

(defn asin
  "Elementwise asin (arcsin, inverse sine) operation: out = arcsin(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.asin name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.asin x))))

(defn sign
  "Element-wise sign (signum) function:
  out = -1 if in < 0
  out = 0 if in = 0
  out = 1 if in > 0

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sign name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.sign x))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SameDiff this ^java.lang.Object o]
    (-> this (.equals o))))

(defn tensor-array
  "returns: `org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayV3`"
  (^org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayV3 [^SameDiff this]
    (-> this (.tensorArray))))

(defn put-place-holder-for-variable
  "Add one or or more place holder variables for the given vertex id.

  Note that if a vertex id in placeHolderVariables isn't present in this samediff instance anyways,
  an ND4JIllegalStateException is thrown

  var-name - the vertex id to add place holders for - `java.lang.String`
  place-holder-variables - the place holder variables - `java.lang.String`"
  ([^SameDiff this ^java.lang.String var-name ^java.lang.String place-holder-variables]
    (-> this (.putPlaceHolderForVariable var-name place-holder-variables))))

(defn xor
  "Boolean XOR (exclusive OR) operation: elementwise (x != 0) XOR (y != 0)
  If x and y arrays have equal shape, the output shape is the same as these inputs.
  Note: supports broadcasting if x and y have different shapes and are broadcastable.
  Returns an array with values 1 where condition is satisfied, or value 0 otherwise.

  name - Name of the output variable - `java.lang.String`
  x - Input 1 - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input 2 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output SDVariable with values 0 and 1 based on where the condition is satisfied - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.xor name x y)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.xor x y))))

(defn softmax-derivative
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - `java.lang.Integer`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable wrt ^java.lang.Integer dimension]
    (-> this (.softmaxDerivative name x wrt dimension)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.softmaxDerivative name x wrt))))

(defn transpose
  "Matrix transpose operation: If input has shape [a,b] output has shape [b,a]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable (transposed input) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.transpose name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.transpose x))))

(defn variable-map
  "Return the internal variable map

  returns: Map of variables by name - `java.util.Map<java.lang.String,org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.Map [^SameDiff this]
    (-> this (.variableMap))))

(defn normmax
  "Max norm (infinity norm) reduction operation: The output contains the max norm for each tensor/subset along the
  specified dimensions:
  out = max(abs(x[i]))
  Note that if keepDims = true, the output variable has the same rank as the input variable,
  with the reduced dimensions having size 1. This can be useful for later broadcast operations (such as subtracting
  the mean along a dimension).
  Example: if input has shape [a,b,c] and dimensions=[1] then output has shape:
  keepDims = true: [a,1,c]
  keepDims = false: [a,c]

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: keep the dimensions that are reduced on (as size 1). False: remove the reduction dimensions - `boolean`
  dimensions - dimensions to reduce over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.normmax name x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.normmax name x dimensions))))

(defn tanh
  "Elementwise tanh (hyperbolic tangent) operation: out = tanh(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.tanh name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.tanh x))))

(defn weighted-cross-entropy-with-logits
  "TODO

  name - `java.lang.String`
  targets - `org.nd4j.autodiff.samediff.SDVariable`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable targets ^org.nd4j.autodiff.samediff.SDVariable inputs ^org.nd4j.autodiff.samediff.SDVariable weights]
    (-> this (.weightedCrossEntropyWithLogits name targets inputs weights)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable targets ^org.nd4j.autodiff.samediff.SDVariable inputs ^org.nd4j.autodiff.samediff.SDVariable weights]
    (-> this (.weightedCrossEntropyWithLogits targets inputs weights))))

(defn swish
  "Element-wise \"swish\" function: out = x * sigmoid(b*x) with b=1.0
  See: https://arxiv.org/abs/1710.05941

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.swish name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.swish x))))

(defn manhattan-distance
  "Manhattan distance (l1 norm, l1 distance) reduction operation. The output contains the Manhattan distance for each
  tensor/subset along the specified dimensions:
  out = sum_i abs(x[i]-y[i])

  name - Name of the output variable - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate cosine similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.manhattanDistance name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.manhattanDistance x y dimensions))))

(defn as-flat-file
  "This method converts SameDiff instance to FlatBuffers and saves it to file which can be restored later

  file - File to save the FlatBuffers serialized graph (including arrays) to - `java.io.File`
  configuration - `org.nd4j.autodiff.execution.conf.ExecutorConfiguration`

  throws: java.io.IOException"
  ([^SameDiff this ^java.io.File file ^org.nd4j.autodiff.execution.conf.ExecutorConfiguration configuration]
    (-> this (.asFlatFile file configuration)))
  ([^SameDiff this ^java.io.File file]
    (-> this (.asFlatFile file))))

(defn depth-to-space
  "Convolution 2d layer batch to space operation on 4d input.
  Reduces input channels dimension by rearranging data into a larger spatial dimensions
  Example: if input has shape [mb, 8, 2, 2] and block size is 2, then output size is [mb, 8/(2*2), 2*2, 2*2]
  = [mb, 2, 4, 4]

  name - Output variable name - `java.lang.String`
  x - the input to depth to space pooling 2d operation - 4d activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  block-size - Block size, in the height/width dimension - `int`
  data-format - Data format: \"NCHW\" or \"NHWC\" - `java.lang.String`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^Integer block-size ^java.lang.String data-format]
    (-> this (.depthToSpace name x block-size data-format)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer block-size ^java.lang.String data-format]
    (-> this (.depthToSpace x block-size data-format))))

(defn get-base-name-for-function
  "Returns the base name for the given function
  if any (may return null)

  function - the function to get the base name for - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: the base name for the given function (if any) based
  on the function's instance id. - `java.lang.String`"
  (^java.lang.String [^SameDiff this ^org.nd4j.autodiff.functions.DifferentialFunction function]
    (-> this (.getBaseNameForFunction function))))

(defn generate-new-var-name
  "Generate a new variable name based on the uniqueness of the base name and arg index
  For example, if baseName = \"X\" will return:
  \"X\" if \"X\" does not already exist, or \"X:argIndex\" if argIndex > 0
  \"X_1\" if \"X\" already exists, or \"X_1:argIndex\" if argIndex > 0
  \"X_2\" if \"X\" and \"X_1\" already exists, or \"X_2:argIndex\" if argIndex > 0
  And so on, until an unused name is found

  base-name - the base name to use (use function.opName() where function is a DifferentialFunction - `java.lang.String`
  arg-index - the arg index - `int`

  returns: the new generated name - `java.lang.String`"
  (^java.lang.String [^SameDiff this ^java.lang.String base-name ^Integer arg-index]
    (-> this (.generateNewVarName base-name arg-index))))

(defn log-entropy
  "Log entropy reduction: log(-sum(x * log(x)))

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to reduce on (null for full array) - `int`

  returns: Output variable: reduced array of rank (input rank - num dimensions) - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.logEntropy name in dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.logEntropy in dimensions))))

(defn stack
  "Stack a set of N SDVariables of rank X into one rank X+1 variable.
  If inputs have shape [a,b,c] then output has shape:
  axis = 0: [N,a,b,c]
  axis = 1: [a,N,b,c]
  axis = 2: [a,b,N,c]
  axis = 3: [a,b,c,N]

  name - Name of the output variable - `java.lang.String`
  axis - Axis to stack on - `int`
  values - Input variables to stack. Must have the same shape for all inputs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Integer axis ^org.nd4j.autodiff.samediff.SDVariable values]
    (-> this (.stack name axis values)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Integer axis ^org.nd4j.autodiff.samediff.SDVariable values]
    (-> this (.stack axis values))))

(defn get-variable
  "Get the variable based on the opName

  name - the opName of the variable - `java.lang.String`

  returns: the variabel instance if there is one - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name]
    (-> this (.getVariable name))))

(defn array-already-exists-for-var-name
  "Returns true if the given vertex id and INDArray already exist.

  var-name - the vertex id - `java.lang.String`

  returns: true if a vertex with the given INDArray exists, and it has an INDArray associated with it - `boolean`"
  (^Boolean [^SameDiff this ^java.lang.String var-name]
    (-> this (.arrayAlreadyExistsForVarName var-name))))

(defn dynamic-partition
  "Dynamically partition the input variable values into the specified number of paritions, using the indices.
  Example:


    input = [1,2,3,4,5]
   numPartitions = 2
   partitions = [1,0,0,1,0]
   out[0] = [2,3,5]
   out[1] = [1,4]

  name - Names for the output variables. Length must be equal to numPartitions - `java.lang.String[]`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  partitions - 1D input with values 0 to numPartitions-1 - `org.nd4j.autodiff.samediff.SDVariable`
  num-partitions - Number of partitions, >= 1 - `int`

  returns: Output variables (equal in number to numPartitions) - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable partitions ^Integer num-partitions]
    (-> this (.dynamicPartition name x partitions num-partitions)))
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable partitions ^Integer num-partitions]
    (-> this (.dynamicPartition x partitions num-partitions))))

(defn set-original-place-holder-shape
  "Set the original shape for a given place holder.
  This is used to track original shapes of place holder variables.
  The reason we track original shapes is to validate possible candidate arrays coming in (especially with -1
  as the expected shapes).

  Note that if isPlaceHolder(String)
  returns false for the passed in vertex id,
  a ND4JIllegalStateException is thrown.

  A vertex id must be added first. You can
  do this with addAsPlaceHolder(String)

  variable-name - the vertex id for the original shape - `java.lang.String`
  shape - the shape of the place holder - `long[]`"
  ([^SameDiff this ^java.lang.String variable-name shape]
    (-> this (.setOriginalPlaceHolderShape variable-name shape))))

(defn separable-conv-2d
  "Separable 2D convolution operation with optional bias

  layer-input - the input to max pooling 2d operation - 4d CNN (image) activations in NCHW format(shape [minibatch, channels, height, width]) or NHWC format (shape [minibatch, height, width, channels]) - `org.nd4j.autodiff.samediff.SDVariable`
  depth-weights - Depth weights, rank 4.If layer input is in NCHW format, depth weights should have format [outputChannels, depthMultiplier, kernelHeight, kernelWidth].If layer input is in NHWC format, depth weights should have format [kernelHeight, kernelWidth, inputChannels, depthMultiplier] - `org.nd4j.autodiff.samediff.SDVariable`
  point-weights - Point weights, rank 4.If layer input is in NCHW format, point weights should have format [outputChannels, inputChannels*depthMultiplier, 1, 1].If layer input is in NHWC format, point weights should have format [1, 1, inputChannels*depthMultiplier, outputChannels] - `org.nd4j.autodiff.samediff.SDVariable`
  bias - Optional bias, rank 1 with shape [outputChannels]. May be null. - `org.nd4j.autodiff.samediff.SDVariable`
  config - Conv2DConfig configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: result of separable convolution 2d operation - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable depth-weights ^org.nd4j.autodiff.samediff.SDVariable point-weights ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.separableConv2d layer-input depth-weights point-weights bias config)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable layer-input ^org.nd4j.autodiff.samediff.SDVariable depth-weights ^org.nd4j.autodiff.samediff.SDVariable point-weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.separableConv2d layer-input depth-weights point-weights config))))

(defn meshgrid
  "Broadcast the 1D input variables onto an n-dimensional grid.
  The resulting variable can be used for example for evaluating functions at all locations on a grid.
  Example:


    input1 = [1, 2, 3]
   input2 = [4, 5, 6]
   SDVariable[] out = meshgrid(input1, input2)
   out[0]:
   [ 1, 2, 3]
   [ 1, 2, 3]
   [ 1, 2, 3]

   out[1]:
   [ 4, 4, 4]
   [ 5, 5, 5]
   [ 6, 6, 6]

  names - List of names for the output variables. Must have exactly N names for N input arrays - `java.util.List`
  inputs - N x 1D input variables - `org.nd4j.autodiff.samediff.SDVariable`

  returns: an array of exactly N SDVariables (for N inputs), of rank N - `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SameDiff this ^java.util.List names ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.meshgrid names inputs)))
  ([^SameDiff this ^java.util.List names ^Boolean cartesian ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.meshgrid names cartesian inputs)))
  ([^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.meshgrid inputs))))

(defn batch-norm
  "Batch norm operation.

  name - `java.lang.String`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  mean - `org.nd4j.autodiff.samediff.SDVariable`
  variance - `org.nd4j.autodiff.samediff.SDVariable`
  gamma - `org.nd4j.autodiff.samediff.SDVariable`
  beta - `org.nd4j.autodiff.samediff.SDVariable`
  apply-gamma - `boolean`
  apply-beta - `boolean`
  epsilon - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable mean ^org.nd4j.autodiff.samediff.SDVariable variance ^org.nd4j.autodiff.samediff.SDVariable gamma ^org.nd4j.autodiff.samediff.SDVariable beta ^Boolean apply-gamma ^Boolean apply-beta ^Double epsilon]
    (-> this (.batchNorm name input mean variance gamma beta apply-gamma apply-beta epsilon)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable mean ^org.nd4j.autodiff.samediff.SDVariable variance ^org.nd4j.autodiff.samediff.SDVariable gamma ^org.nd4j.autodiff.samediff.SDVariable beta ^Boolean apply-gamma ^Boolean apply-beta ^Double epsilon]
    (-> this (.batchNorm input mean variance gamma beta apply-gamma apply-beta epsilon))))

(defn loss-mcxent
  "name - `java.lang.String`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMCXENT name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.lossMCXENT x y dimensions))))

(defn step
  "Elementwise step function:
  out(x) = 1 if x >= cutoff
  out(x) = 0 otherwise

  name - Name of the output variable - `java.lang.String`
  in - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - Cutoff value for step function - `double`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable in ^Double cutoff]
    (-> this (.step name in cutoff)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable in ^Double cutoff]
    (-> this (.step in cutoff))))

(defn euclidean-distance
  "Euclidean distance (l2 norm, l2 distance) reduction operation. The output contains the Euclidean distance for each
  tensor/subset along the specified dimensions:
  out = sqrt( sum_i (x[i] - y[i])^2 )

  name - `java.lang.String`
  x - Input variable x - `org.nd4j.autodiff.samediff.SDVariable`
  y - Input variable y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - Dimensions to calculate cosine similarity over - `int`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.euclideanDistance name x y dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.euclideanDistance x y dimensions))))

(defn acos
  "Elementwise acos (arccosine, inverse cosine) operation: out = arccos(x)

  name - Output variable name - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Output variable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.acos name x)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.acos x))))

(defn if-statement
  "conditional - `org.nd4j.autodiff.samediff.SameDiffConditional`
  condition-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  true-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  false-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  input-vars - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.linalg.api.ops.impl.controlflow.If`"
  (^org.nd4j.linalg.api.ops.impl.controlflow.If [^SameDiff this ^org.nd4j.autodiff.samediff.SameDiffConditional conditional ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition condition-body ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition true-body ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition false-body input-vars]
    (-> this (.ifStatement conditional condition-body true-body false-body input-vars))))

(defn random-log-normal
  "Generate a new random SDVariable, where values are randomly sampled according to a Log Normal distribution,
  i.e., log(x) ~ N(mean, stdev)

  name - Name of the new SDVariable - `java.lang.String`
  mean - Mean value for the random array - `double`
  stddev - Standard deviation for the random array - `double`
  shape - Shape of the new random SDVariable - `long`

  returns: New SDVariable - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^Double mean ^Double stddev ^Long shape]
    (-> this (.randomLogNormal name mean stddev shape)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^Double mean ^Double stddev ^Long shape]
    (-> this (.randomLogNormal mean stddev shape))))

(defn reverse-sequence
  "Reverse sequence op: for each slice along dimension seqDimension, the first seqLength values are reversed

  name - Name of the output variable - `java.lang.String`
  x - Input variable - `org.nd4j.autodiff.samediff.SDVariable`
  seq-lengths - Length of the sequences - `org.nd4j.autodiff.samediff.SDVariable`
  seq-dim - Sequence dimension - `int`
  batch-dim - Batch dimension - `int`

  returns: Reversed sequences - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths ^Integer seq-dim ^Integer batch-dim]
    (-> this (.reverseSequence name x seq-lengths seq-dim batch-dim)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths ^Integer seq-dim ^Integer batch-dim]
    (-> this (.reverseSequence x seq-lengths seq-dim batch-dim)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths]
    (-> this (.reverseSequence name x seq-lengths)))
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiff this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths]
    (-> this (.reverseSequence x seq-lengths))))

