(ns org.datavec.api.io.labels.PathMultiLabelGenerator
  "PathMultiLabelGenerator: interface to infer the label(s) of a file directly from the URI/path
 Similar to PathLabelGenerator, with 2 main differences:
 (a) Can be used for multi-label, multi-class classification (i.e., return *multiple* NDArray writables, for use in
 networks with multiple output layers)
 (b) Does not support inferring label classes

 Regarding (b) above, this means that the implementations of PathMultiLabelGenerator typically need to (for classification
 use cases) do one of two things (either will work, though down-stream usage of these arrays can vary slightly):
 (a) Perform label to integer index assignment (i.e., return an IntWritable(0) for A, if you have 3 classes {A,B,C})
 (b) Create a one-hot NDArrayWritable. For 3 classes {A,B,C} you should return a [1,0,0], [0,1,0] or [0,0,1] NDArrayWritable
 Comparatively, PathLabelGenerator can return a Text writable with the label (i.e., \"class_3\" or \"cat\") for classification.

 More generally, PathMultiLabelGenerator must return Writables of one of the following types:
 DoubleWritable, FloatWritable,
 IntWritable, LongWritable or
 NDArrayWritable.
 NDArrayWritable is used for classification (via one-hot NDArrayWritable) or multi-output regression (where all values
 are grouped together into a single array/writable) - whereas the others (double/float/int/long writables) are
 typically used for single output regression cases, or (IntWritable) for classification where downstream classes (notably
 DL4J's RecordReader(Multi)DataSetIterator) will convert the integer index (IntWritable) to a one-hot array ready for
 training.

 In principle, you can also return time series (3d - shape [1,size,seqLength]) or images (4d - shape
 [1,channels,height,width]) as a \"label\" for a given input image."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.labels PathMultiLabelGenerator]))

(defn get-labels
  "uri-path - The file or URI path to get the label for - `java.lang.String`

  returns: A list of labels for the specified URI/path - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^PathMultiLabelGenerator this ^java.lang.String uri-path]
    (-> this (.getLabels uri-path))))

