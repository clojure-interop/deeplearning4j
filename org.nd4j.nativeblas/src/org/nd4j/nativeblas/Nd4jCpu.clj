(ns org.nd4j.nativeblas.Nd4jCpu
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu]))

(defn ->nd-4j-cpu
  "Constructor."
  (^Nd4jCpu []
    (new Nd4jCpu )))

(def *-host
  "Static Constant.

  enum nd4j::memory::MemoryType

  type: int"
  Nd4jCpu/HOST)

(def *-device
  "Static Constant.

  enum nd4j::memory::MemoryType

  type: int"
  Nd4jCpu/DEVICE)

(def *-data-type-inherit
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_INHERIT)

(def *-data-type-bool
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_BOOL)

(def *-data-type-float-8
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_FLOAT8)

(def *-data-type-half
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_HALF)

(def *-data-type-half-2
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_HALF2)

(def *-data-type-float
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_FLOAT)

(def *-data-type-double
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_DOUBLE)

(def *-data-type-int-8
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_INT8)

(def *-data-type-int-16
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_INT16)

(def *-data-type-int-32
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_INT32)

(def *-data-type-int-64
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_INT64)

(def *-data-type-uint-8
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_UINT8)

(def *-data-type-uint-16
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_UINT16)

(def *-data-type-uint-32
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_UINT32)

(def *-data-type-uint-64
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_UINT64)

(def *-data-type-qint-8
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_QINT8)

(def *-data-type-qint-16
  "Static Constant.

  enum nd4j::DataType

  type: int"
  Nd4jCpu/DataType_QINT16)

(def *-ndarray
  "Static Constant.

  enum nd4j::graph::VariableType

  type: int"
  Nd4jCpu/NDARRAY)

(def *-array-list
  "Static Constant.

  enum nd4j::graph::VariableType

  type: int"
  Nd4jCpu/ARRAY_LIST)

(def *-flow
  "Static Constant.

  enum nd4j::graph::VariableType

  type: int"
  Nd4jCpu/FLOW)

(def *-max-uint
  "Static Constant.

  type: long"
  Nd4jCpu/MAX_UINT)

(def *-max-dimension
  "Static Constant.

  Copyright (c) 2015-2018 Skymind, Inc.
  This program and the accompanying materials are made available under the
  terms of the Apache License, Version 2.0 which is available at
  https://www.apache.org/licenses/LICENSE-2.0.
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
  SPDX-License-Identifier: Apache-2.0

  type: int"
  Nd4jCpu/MAX_DIMENSION)

(def *-max-num-threads
  "Static Constant.

  type: int"
  Nd4jCpu/MAX_NUM_THREADS)

(def *-max-rank
  "Static Constant.

  type: int"
  Nd4jCpu/MAX_RANK)

(def *-max-coord
  "Static Constant.

  type: int"
  Nd4jCpu/MAX_COORD)

(def *-prealloc-size
  "Static Constant.

  type: int"
  Nd4jCpu/PREALLOC_SIZE)

(def *-element-threshold
  "Static Constant.

  type: int"
  Nd4jCpu/ELEMENT_THRESHOLD)

(def *-tad-threshold
  "Static Constant.

  type: int"
  Nd4jCpu/TAD_THRESHOLD)

(def *-input-type-boolean
  "Static Constant.

  enum nd4j::ops::InputType

  type: int"
  Nd4jCpu/InputType_BOOLEAN)

(def *-input-type-numeric
  "Static Constant.

  enum nd4j::ops::InputType

  type: int"
  Nd4jCpu/InputType_NUMERIC)

(def *-input-type-stringular
  "Static Constant.

  enum nd4j::ops::InputType

  type: int"
  Nd4jCpu/InputType_STRINGULAR)

(def *-input-type-numeric-set
  "Static Constant.

  enum nd4j::ops::InputType

  type: int"
  Nd4jCpu/InputType_NUMERIC_SET)

(def *-input-type-stringular-set
  "Static Constant.

  enum nd4j::ops::InputType

  type: int"
  Nd4jCpu/InputType_STRINGULAR_SET)

(defn *is-like-vector
  "shape-info - `org.bytedeco.javacpp.LongPointer`
  pos-of-non-unity-dim - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape") (value="bool")   boolean`"
  ([^org.bytedeco.javacpp.LongPointer shape-info ^org.bytedeco.javacpp.IntPointer pos-of-non-unity-dim]
    (Nd4jCpu/isLikeVector shape-info pos-of-non-unity-dim)))

(defn *one-dim-equal-to-length
  "When 1 dimension is the whole length of the
  array

  shape - `org.bytedeco.javacpp.LongPointer`
  rank - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank]
    (Nd4jCpu/oneDimEqualToLength shape rank))
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/oneDimEqualToLength shape-info)))

(defn *reduction-index-for-tad
  "Map a tad to a
  reduction index.

  tad-index-for-original - the original tad index for thesplit up problem (eg: split is dimension 3 mapping to a 2,3 problem) - `int`
  tads-for-reduced - the number of tads for the shrunk down problem (eg: 2,3) - `int`
  tads-for-original - the number of tads for the smaller problem (eg: 3) - `int`

  returns: `(value="shape")   int`"
  ([^Integer tad-index-for-original ^Integer tads-for-reduced ^Integer tads-for-original]
    (Nd4jCpu/reductionIndexForTad tad-index-for-original tads-for-reduced tads-for-original)))

(defn *create-scalar-shape-info
  "ret - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer ret]
    (Nd4jCpu/createScalarShapeInfo ret))
  ([]
    (Nd4jCpu/createScalarShapeInfo )))

(defn *tad-threshold
  "returns: `int`"
  (^Integer []
    (Nd4jCpu/TAD_THRESHOLD )))

(defn *every-index-but
  "Iterate over a given set of indexes
  the begin and end indexes are 0 based.
  1 padding is automatically assumed for the ending.
  For example if you want to iterate over 0 to 4
  it will go to 4 rather than 3.
  indexes should be the indexes to exclude
  indexes length should be the length of indexes

  indexes - `org.bytedeco.javacpp.LongPointer`
  indexes-length - `int`
  begin - `int`
  end - `int`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer indexes ^Integer indexes-length ^Integer begin ^Integer end]
    (Nd4jCpu/everyIndexBut indexes indexes-length begin end)))

(defn *tensors-along-dimension
  "Computes the number
  of tensors along
  a given dimension

  shape - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape") (value="Nd4jLong")   long tensorsAlongDimension(int rank, int length, @`"
  ([^org.bytedeco.javacpp.LongPointer shape ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/tensorsAlongDimension shape dimension dimension-length)))

(defn *keep
  "Keep the given indexes
  in the data

  data - `org.bytedeco.javacpp.LongPointer`
  index - `org.bytedeco.javacpp.IntPointer`
  index-length - `int`
  data-length - `int`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer data ^org.bytedeco.javacpp.IntPointer index ^Integer index-length ^Integer data-length]
    (Nd4jCpu/keep data index index-length data-length)))

(defn *shape-info-only-shape-and-stride
  "reverse-copy-stride - `boolean`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer shapeInfoOnlyShapeAndStride((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer dimension, int dimensionLength, @`"
  ([^Boolean reverse-copy-stride]
    (Nd4jCpu/shapeInfoOnlyShapeAndStride reverse-copy-stride)))

(defn *offset
  "Returns the offset portion of an information buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong")   long`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/offset buffer)))

(defn *print-array
  "arr - `org.bytedeco.javacpp.FloatPointer`
  length - `int`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.FloatPointer arr ^Integer length]
    (Nd4jCpu/printArray arr length)))

(defn *is-row-vector
  "shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/isRowVector shape-info)))

(defn *tad-element-wise-stride
  "Tad element wise stride:
  given the inner most dimension (the sorted dimension of the last)
  the element wise stride of the tad (disregarding order) is the
  last dimension's stride.
  For a given singular dimension this will just be the only entry.
  For example, given the following c order shape/stride:
  2,2,3,2
  12,6,2,1
  The tad element wise stride for 3 will be 1.
  For zero it wil be 12
  For 2,3 it's 1
  Note here that the multi dimensional 2,3 case
  is equivalent to the singular 3 case.
  Note that this is for the dimension that ultimately
  ends up removed.
  Again: this may not preserve ordering of the tad
  but maybe used for reductions.

  shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/tadElementWiseStride shape-info dimension dimension-length)))

(defn *prod
  "Returns the prod of the data
  up to the given length

  data - `org.bytedeco.javacpp.LongPointer`
  length - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer data ^Integer length]
    (Nd4jCpu/prod data length)))

(defn *shape-info-length
  "Returns the length of the
  shape information buffer:
  rank * 2  3

  rank - the rank to get the shapeinfo length for - `int`

  returns: rank * 2  4 - `(value="shape")   int`"
  ([^Integer rank]
    (Nd4jCpu/shapeInfoLength rank)))

(defn *permute-shape-buffer
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`
  rearrange - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer ^org.bytedeco.javacpp.IntPointer rearrange]
    (Nd4jCpu/permuteShapeBuffer shape-buffer rearrange)))

(defn *is-column-vector
  "shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/isColumnVector shape-info)))

(defn *slices
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer]
    (Nd4jCpu/slices shape-buffer)))

(defn *compute-indices
  "Compute the real linear indices for the given shape and stride

  stride - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer computeIndices(int rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer stride]
    (Nd4jCpu/computeIndices stride)))

(defn *to-shape-buffer
  "Returns a shape buffer
  for the shape information metadata.

  info - `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation info]
    (Nd4jCpu/toShapeBuffer info)))

(defn *print-shape-info-linear
  "shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/printShapeInfoLinear shape-info)))

(defn *permute
  "Permute the shape information

  info - the shape information to permute - `org.bytedeco.javacpp.PointerPointer`
  rearrange - the order to re arrange - `org.bytedeco.javacpp.IntPointer`
  rank - the rank of the rearrange array - `int`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.PointerPointer info ^org.bytedeco.javacpp.IntPointer rearrange ^Integer rank]
    (Nd4jCpu/permute info rearrange rank)))

(defn *compute-element-wise-stride
  "Compute the element wise stride
  for a given shape/stride configuration

  stride - the stride - `org.bytedeco.javacpp.LongPointer`
  is-f-order - 0 or 1 for whether the array is fordered or not - `int`

  returns: -1 if there is no element wise stride the
  element wise stride of reshape(1,length) otherwise - `(value="shape")   int computeElementWiseStride(int rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer stride ^Integer is-f-order]
    (Nd4jCpu/computeElementWiseStride stride is-f-order)))

(defn *equals-strict
  "shape-b - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean equalsStrict((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeA, @`"
  ([^org.bytedeco.javacpp.LongPointer shape-b]
    (Nd4jCpu/equalsStrict shape-b)))

(defn *sub-array-index
  "min-shape-info - `org.bytedeco.javacpp.LongPointer`
  max-idx - `int`

  returns: `(value="shape") (value="Nd4jLong")   long subArrayIndex((value="const Nd4jLong*") org.bytedeco.javacpp.LongPointer maxShapeInfo, @`"
  ([^org.bytedeco.javacpp.LongPointer min-shape-info ^Integer max-idx]
    (Nd4jCpu/subArrayIndex min-shape-info max-idx)))

(defn *shape-equals
  "shape-2 - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean shapeEquals(int shape1Rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape1, int shape2Rank, @`"
  ([^org.bytedeco.javacpp.LongPointer shape-2]
    (Nd4jCpu/shapeEquals shape-2)))

(defn *stride-equals
  "stride-2 - `org.bytedeco.javacpp.LongPointer`
  rank-2 - `int`

  returns: `(value="shape") (value="bool")   boolean strideEquals((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer stride1, int rank1, @`"
  ([^org.bytedeco.javacpp.LongPointer stride-2 ^Integer rank-2]
    (Nd4jCpu/strideEquals stride-2 rank-2))
  ([^org.bytedeco.javacpp.LongPointer shape-2]
    (Nd4jCpu/strideEquals shape-2)))

(defn *print-int-array
  "arr - `org.bytedeco.javacpp.LongPointer`
  length - `int`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer arr ^Integer length]
    (Nd4jCpu/printIntArray arr length)))

(defn *rank
  "Returns the rank portion of
  an information buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/rank buffer)))

(defn *is-vector
  "Returns whether the
  given shape is a vector or not

  shape - the shape of the array - `org.bytedeco.javacpp.LongPointer`
  rank - the rank of cthe shape - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank]
    (Nd4jCpu/isVector shape rank))
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/isVector shape-info)))

(defn *get-order
  "Get the ordering for the device

  stride - `org.bytedeco.javacpp.LongPointer`
  element-stride - `int`

  returns: `(value="shape")   char getOrder(int length, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer stride ^Integer element-stride]
    (Nd4jCpu/getOrder stride element-stride)))

(defn *ensure-vector-shape
  "Returns a shape
  forces the given length to be 2.

  shape - the shape to modify - `org.bytedeco.javacpp.LongPointer`
  dimension - the dimension (row or column)for the shape to be returned as - `int`

  returns: the new shape - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer dimension]
    (Nd4jCpu/ensureVectorShape shape dimension))
  ([^org.bytedeco.javacpp.LongPointer shape]
    (Nd4jCpu/ensureVectorShape shape)))

(defn *shape-of
  "Returns the shape portion of an information
  buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/shapeOf buffer)))

(defn *create-permute-indexes
  "Rearrange the permute indexes
  according to which dimensions are specified.
  For example, dimension is implicitly:
  0,1,2
  If you want to do a reduce along dimensions 0 and 1,
  you need to permute the indexes to be:
  2,0,1
  which will give us the ability to ierate along an element
  wise stride.

  original-rank - `int`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Integer original-rank ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/createPermuteIndexes original-rank dimension dimension-length)))

(defn *size-at
  "shape - `org.bytedeco.javacpp.LongPointer`
  dim - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer dim]
    (Nd4jCpu/sizeAt shape dim)))

(defn *compute-result-shape
  "original-shape-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer original-shape-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/computeResultShape original-shape-buffer dimension dimension-length)))

(defn *copy-shape
  "original-shape - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer original-shape]
    (Nd4jCpu/copyShape original-shape)))

(defn *get-offset
  "Get an offset for retrieval
  from a data buffer
  based on the given
  shape stride and given indices

  indices - the indices to iterate over - `org.bytedeco.javacpp.LongPointer`
  rank - `int`

  returns: the double at the specified index - `(value="shape") (value="Nd4jLong")   long getOffset((value="Nd4jLong") long baseOffset, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer stride, @`"
  ([^org.bytedeco.javacpp.LongPointer indices ^Integer rank]
    (Nd4jCpu/getOffset indices rank)))

(defn *tad-index
  "Given an linear index, element wise stride
  and the length of each tad
  map a linear index to a tad

  i - the index to map - `int`
  element-wise-stride - `int`
  num-elements-per-tad - the number of elementsper tad - `int`

  returns: `(value="shape")   int`"
  ([^Integer i ^Integer element-wise-stride ^Integer num-elements-per-tad]
    (Nd4jCpu/tadIndex i element-wise-stride num-elements-per-tad)))

(defn *shape-buffer
  "Get the shape info buffer
  for the given rank and shape.

  shape - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer shapeBuffer(int rank, @`"
  ([^org.bytedeco.javacpp.LongPointer shape]
    (Nd4jCpu/shapeBuffer shape)))

(defn *tad-length
  "shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/tadLength shape-info dimension dimension-length)))

(defn *shape-buffer-of-npy
  "fortran-order - `boolean`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer shapeBufferOfNpy(int rank, (value="unsigned int*") org.bytedeco.javacpp.IntPointer shape, @`"
  ([^Boolean fortran-order]
    (Nd4jCpu/shapeBufferOfNpy fortran-order)))

(defn *shape-scalar
  "buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/shapeScalar buffer)))

(defn *reduction-index-for-linear
  "Maps a linear index to a reduction index

  i - the linear index to map - `int`
  element-wise-stride - the element wise stridefor the multiple problem - `int`
  num-elements-per-tad - `int`
  tad-num - the number of tads for the shrunken problem - `int`
  original-tad-num - the tad number for the reduced version of the problem - `int`

  returns: `(value="shape")   int`"
  ([^Integer i ^Integer element-wise-stride ^Integer num-elements-per-tad ^Integer tad-num ^Integer original-tad-num]
    (Nd4jCpu/reductionIndexForLinear i element-wise-stride num-elements-per-tad tad-num original-tad-num)))

(defn *tads-per-reduce-index
  "Computes the number of tads
  per reduce index for the
  reduction tad.

  tads-for-reduce - `int`
  tads-for-original - `int`

  returns: `(value="shape")   int`"
  ([^Integer tads-for-reduce ^Integer tads-for-original]
    (Nd4jCpu/tadsPerReduceIndex tads-for-reduce tads-for-original)))

(defn *prod-long
  "data - `org.bytedeco.javacpp.LongPointer`
  length - `int`

  returns: `(value="shape") (value="Nd4jLong")   long`"
  ([^org.bytedeco.javacpp.LongPointer data ^Integer length]
    (Nd4jCpu/prodLong data length)))

(defn *max-uint
  "Copyright (c) 2015-2018 Skymind, Inc.
  This program and the accompanying materials are made available under the
  terms of the Apache License, Version 2.0 which is available at
  https://www.apache.org/licenses/LICENSE-2.0.
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
  SPDX-License-Identifier: Apache-2.0

  returns: `long`"
  (^Long []
    (Nd4jCpu/MAX_UINT )))

(defn *create-shape-info
  "stride - `org.bytedeco.javacpp.LongPointer`
  rank - `int`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer createShapeInfo((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer stride ^Integer rank]
    (Nd4jCpu/createShapeInfo stride rank))
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/createShapeInfo buffer)))

(defn *subtract
  "Copyright (c) 2015-2018 Skymind, Inc.
  This program and the accompanying materials are made available under the
  terms of the Apache License, Version 2.0 which is available at
  https://www.apache.org/licenses/LICENSE-2.0.
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
  SPDX-License-Identifier: Apache-2.0

  arg-0 - `float`
  arg-1 - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `(value="nd4j")  (value="operator -")   org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  ([^Float arg-0 ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray arg-1]
    (Nd4jCpu/subtract arg-0 arg-1)))

(defn *do-permute-shape-buffer
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`
  rearrange - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer ^org.bytedeco.javacpp.IntPointer rearrange]
    (Nd4jCpu/doPermuteShapeBuffer shape-buffer rearrange))
  ([^org.bytedeco.javacpp.LongPointer tmp-buffer]
    (Nd4jCpu/doPermuteShapeBuffer tmp-buffer)))

(defn *permute-shape-buffer-in-place
  "out - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void permuteShapeBufferInPlace((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeBuffer, org.bytedeco.javacpp.IntPointer rearrange, @`"
  ([^org.bytedeco.javacpp.LongPointer out]
    (Nd4jCpu/permuteShapeBufferInPlace out)))

(defn *element-wise-stride
  "Returns the element wise stride for this information
  buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong")   long`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/elementWiseStride buffer)))

(defn *shape-buffer-fortran
  "Get the shape info buffer
  for the given rank and shape.

  shape - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer shapeBufferFortran(int rank, @`"
  ([^org.bytedeco.javacpp.LongPointer shape]
    (Nd4jCpu/shapeBufferFortran shape)))

(defn *transpose-inplace
  "This method does inplace transpose of given shapeBuffer

  shape-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer]
    (Nd4jCpu/transposeInplace shape-buffer)))

(defn *trace-new
  "id - `int`

  returns: `(value="shape")   void`"
  ([^Integer id]
    (Nd4jCpu/traceNew id)))

(defn *reshape-cf
  "target - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean reshapeCF(int oldRank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer oldShape, int newRank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer newShape, (value="bool") boolean isFOrder, @`"
  ([^org.bytedeco.javacpp.LongPointer target]
    (Nd4jCpu/reshapeCF target)))

(defn *calc-strides
  "Computes the standard packed array strides for a given shape.

  shape - the shape of a matrix: - `org.bytedeco.javacpp.LongPointer`
  rank - `int`
  start-num - the start number for the strides - `int`

  returns: the strides for a matrix of n dimensions - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank ^Integer start-num]
    (Nd4jCpu/calcStrides shape rank start-num))
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank]
    (Nd4jCpu/calcStrides shape rank))
  ([^org.bytedeco.javacpp.LongPointer ret]
    (Nd4jCpu/calcStrides ret)))

(defn *tads-per-block
  "Computes the number of tads per block

  block-size - `int`
  tads - `int`

  returns: `(value="shape")   int`"
  ([^Integer block-size ^Integer tads]
    (Nd4jCpu/tadsPerBlock block-size tads)))

(defn *element-threshold
  "Copyright (c) 2015-2018 Skymind, Inc.
  This program and the accompanying materials are made available under the
  terms of the Apache License, Version 2.0 which is available at
  https://www.apache.org/licenses/LICENSE-2.0.
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
  SPDX-License-Identifier: Apache-2.0

  returns: `int`"
  (^Integer []
    (Nd4jCpu/ELEMENT_THRESHOLD )))

(defn *sub-2-ind
  "Convert the given index (such as 1,1)
  to a linear index

  indices - the index to convert - `org.bytedeco.javacpp.LongPointer`

  returns: the linear index given the shape
  and indices - `(value="shape")   int sub2Ind(int rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer indices]
    (Nd4jCpu/sub2Ind indices)))

(defn *length
  "shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong")   long`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/length shape-info)))

(defn *do-permute-shape-info
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`
  rearrange - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer ^org.bytedeco.javacpp.IntPointer rearrange]
    (Nd4jCpu/doPermuteShapeInfo shape-buffer rearrange))
  ([^org.bytedeco.javacpp.LongPointer rearrange]
    (Nd4jCpu/doPermuteShapeInfo rearrange)))

(defn *is-scalar
  "Returns whether
  the given shape info buffer
  represents a scalar shape

  info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer info]
    (Nd4jCpu/isScalar info)))

(defn *info-from-buffer
  "Converts a raw int buffer of the layout:
  rank
  shape
  stride
  offset
  elementWiseStride
  where shape and stride are both straight int pointers

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/infoFromBuffer buffer)))

(defn *order
  "Returns the ordering
  for this shape information buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   char`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/order buffer)))

(defn *shape-vector
  "buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void shapeVector((value="const Nd4jLong") long length, @`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/shapeVector buffer)))

(defn *slice-of-shape-buffer
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer sliceOfShapeBuffer((value="Nd4jLong") long sliceIdx, @`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer]
    (Nd4jCpu/sliceOfShapeBuffer shape-buffer)))

(defn *is-matrix
  "Returns whether the
  given shape is a vector or not

  shape - the shape of the array - `org.bytedeco.javacpp.LongPointer`
  rank - the rank of the shape - `int`

  returns: `(value="shape")   int`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank]
    (Nd4jCpu/isMatrix shape rank))
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/isMatrix shape-info)))

(defn *detach-shape
  "original-shape - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer original-shape]
    (Nd4jCpu/detachShape original-shape)))

(defn *do-permute-swap
  "In place permute swap

  shape - `org.bytedeco.javacpp.PointerPointer`
  rearrange - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape")   void doPermuteSwap(int length, @`"
  ([^org.bytedeco.javacpp.PointerPointer shape ^org.bytedeco.javacpp.IntPointer rearrange]
    (Nd4jCpu/doPermuteSwap shape rearrange)))

(defn *check-dimensions
  "rank - `int`
  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="shape")   void`"
  ([^Integer rank ^org.bytedeco.javacpp.IntPointer dimensions]
    (Nd4jCpu/checkDimensions rank dimensions)))

(defn *stride-descending-c-ascending-f
  "shape-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean`"
  ([^org.bytedeco.javacpp.LongPointer shape-buffer]
    (Nd4jCpu/strideDescendingCAscendingF shape-buffer)))

(defn *slice
  "Return the slice (shape  1 in pointer arithmetic)

  shape - the shape to take the slice of - `org.bytedeco.javacpp.LongPointer`

  returns: the shape array - the first entry - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer shape]
    (Nd4jCpu/slice shape)))

(defn *copy-to
  "Return a copy of a buffer.
  This buffer allocates memory
  that must be freed elsewhere.

  indexes - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void copyTo(int length, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer from, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer to, @`"
  ([^org.bytedeco.javacpp.LongPointer indexes]
    (Nd4jCpu/copyTo indexes)))

(defn *equals-soft
  "shape-b - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean equalsSoft((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeA, @`"
  ([^org.bytedeco.javacpp.LongPointer shape-b]
    (Nd4jCpu/equalsSoft shape-b)))

(defn *extra
  "buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")    org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/extra buffer)))

(defn *slice-offset-for-tensor
  "calculates the offset for a tensor

  tensor-shape - `org.bytedeco.javacpp.LongPointer`
  tensor-shape-length - `int`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape") (value="Nd4jLong")   long sliceOffsetForTensor(int rank, int index, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^org.bytedeco.javacpp.LongPointer tensor-shape ^Integer tensor-shape-length ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/sliceOffsetForTensor tensor-shape tensor-shape-length dimension dimension-length))
  ([^Integer index ^Integer tensor-length ^Integer length-per-slice-2]
    (Nd4jCpu/sliceOffsetForTensor index tensor-length length-per-slice-2)))

(defn *add
  "arg-0 - `float`
  arg-1 - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `(value="nd4j")  (value="operator ")   org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  ([^Float arg-0 ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray arg-1]
    (Nd4jCpu/add arg-0 arg-1)))

(defn *update-strides
  "shape - `org.bytedeco.javacpp.LongPointer`
  order - `char`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Character order]
    (Nd4jCpu/updateStrides shape order)))

(defn *is-empty
  "Compute the length of the given shape

  shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="bool")   boolean`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/isEmpty shape-info)))

(defn *calc-strides-fortran
  "Computes the standard packed array strides for a given shape.

  shape - the shape of a matrix: - `org.bytedeco.javacpp.LongPointer`
  rank - `int`
  start-num - the start number for the strides - `int`

  returns: the strides for a matrix of n dimensions - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank ^Integer start-num]
    (Nd4jCpu/calcStridesFortran shape rank start-num))
  ([^org.bytedeco.javacpp.LongPointer shape ^Integer rank]
    (Nd4jCpu/calcStridesFortran shape rank))
  ([^org.bytedeco.javacpp.LongPointer ret]
    (Nd4jCpu/calcStridesFortran ret)))

(defn *rear-most-left-over-item
  "Returns the prod of the data
  up to the given length

  dimension - `org.bytedeco.javacpp.LongPointer`
  dimension-length - `int`

  returns: `(value="shape")   int rearMostLeftOverItem((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer data, @`"
  ([^org.bytedeco.javacpp.LongPointer dimension ^Integer dimension-length]
    (Nd4jCpu/rearMostLeftOverItem dimension dimension-length)))

(defn *reduction-index-element-wise-stride
  "Returns the element wise stride for this information
  buffer
  relative to a dimension and ordering for a reduction index

  buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `(value="shape") (value="Nd4jLong")   long`"
  ([^org.bytedeco.javacpp.LongPointer buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/reductionIndexElementWiseStride buffer dimension dimension-length)))

(defn *shape-info-byte-length
  "rank - `int`

  returns: `(value="shape") (value="size_t")   long`"
  ([^Integer rank]
    (Nd4jCpu/shapeInfoByteLength rank)))

(defn *condition-helper
  "Copyright (c) 2015-2018 Skymind, Inc.
  This program and the accompanying materials are made available under the
  terms of the Apache License, Version 2.0 which is available at
  https://www.apache.org/licenses/LICENSE-2.0.
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
  SPDX-License-Identifier: Apache-2.0

  format - `java.lang.String`

  returns: `(value="nd4j::ops") (value="Nd4jStatus")   int conditionHelper((value="char*") java.lang.String file, int line, int condition, int argNumber, @`"
  ([^java.lang.String format]
    (Nd4jCpu/conditionHelper format)))

(defn *can-reshape
  "is-f-order - `boolean`

  returns: `(value="shape") (value="bool")   boolean canReshape(int oldRank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer oldShape, int newRank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer newShape, @`"
  ([^Boolean is-f-order]
    (Nd4jCpu/canReshape is-f-order)))

(defn *tad-for-block-index
  "Returns the tensor along dimension
  for the given block index

  block-size - `int`
  block-idx - `int`
  i - `int`

  returns: `(value="shape")   int`"
  ([^Integer block-size ^Integer block-idx ^Integer i]
    (Nd4jCpu/tadForBlockIndex block-size block-idx i)))

(defn *ind-2sub-order
  "Convert a linear index to
  the equivalent nd index

  out - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void ind2subOrder((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeInfo, (value="Nd4jLong") long index, (value="Nd4jLong") long numIndices, @`"
  ([^org.bytedeco.javacpp.LongPointer out]
    (Nd4jCpu/ind2subOrder out)))

(defn *print-shape-info
  "shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer shape-info]
    (Nd4jCpu/printShapeInfo shape-info)))

(defn *shape-copy
  "to-copy - the shape to copy - `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`

  returns: a copy of the original struct - `(value="shape")   org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  ([^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation to-copy]
    (Nd4jCpu/shapeCopy to-copy)))

(defn *length-per-slice
  "Get the length per slice of the
  given shape and the dimension

  shape - the shape of to getthe length per slice for - `org.bytedeco.javacpp.LongPointer`
  dimension - the dimension toget the length per slice for - `org.bytedeco.javacpp.IntPointer`
  dimension-length - the length of the dimension array - `int`

  returns: the length per slice of the given shape
  along the given dimension - `(value="shape") (value="Nd4jLong")   long lengthPerSlice(int rank, @`"
  ([^org.bytedeco.javacpp.LongPointer shape ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (Nd4jCpu/lengthPerSlice shape dimension dimension-length)))

(defn *shape-old-scalar
  "buffer - `org.bytedeco.javacpp.LongPointer`
  order - `char`

  returns: `(value="shape")   void`"
  ([^org.bytedeco.javacpp.LongPointer buffer ^Character order]
    (Nd4jCpu/shapeOldScalar buffer order)))

(defn *stride
  "Returns the stride portion of an information
  buffer

  buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^org.bytedeco.javacpp.LongPointer buffer]
    (Nd4jCpu/stride buffer)))

(defn *tad-index-for-linear
  "linear-index - `int`
  tad-length - `int`

  returns: `(value="shape")   int`"
  ([^Integer linear-index ^Integer tad-length]
    (Nd4jCpu/tadIndexForLinear linear-index tad-length)))

(defn *ind-2sub-c
  "Convert a linear index to
  the equivalent nd index

  index - the index to map - `long`

  returns: the mapped indexes along each dimension - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer ind2subC(int rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, @`"
  ([^Long index]
    (Nd4jCpu/ind2subC index)))

(defn *ind-2sub
  "Convert a linear index to
  the equivalent nd index

  num-indices - the number of total indices (typically prod of shape( - `long`

  returns: the mapped indexes along each dimension - `(value="shape") (value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer ind2sub(int rank, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shape, (value="Nd4jLong") long index, @`"
  ([^Long num-indices]
    (Nd4jCpu/ind2sub num-indices)))

