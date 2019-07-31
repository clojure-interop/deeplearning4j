(ns org.nd4j.linalg.dataset.api.DataSetUtil
  "Created by susaneraly on 9/20/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api DataSetUtil]))

(defn ->data-set-util
  "Constructor."
  (^DataSetUtil []
    (new DataSetUtil )))

(defn *merge-4d
  "Merge the specified 4d arrays and masks. See mergeFeatures(INDArray[], INDArray[])
  and mergeLabels(INDArray[], INDArray[])

  arrays - Arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  masks - Mask arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - Index to extract out before merging - `int`

  returns: Merged arrays and mask - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [arrays masks ^Integer in-out-idx]
    (DataSetUtil/merge4d arrays masks in-out-idx))
  (^org.nd4j.linalg.primitives.Pair [arrays masks]
    (DataSetUtil/merge4d arrays masks)))

(defn *merge-masks-4d
  "features-or-labels - `org.nd4j.linalg.api.ndarray.INDArray[]`
  masks - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [features-or-labels masks]
    (DataSetUtil/mergeMasks4d features-or-labels masks)))

(defn *tailor-3d-2d
  "Deprecated.

  dataset - `org.nd4j.linalg.dataset.api.DataSet`
  are-features - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.dataset.api.DataSet dataset ^Boolean are-features]
    (DataSetUtil/tailor3d2d dataset are-features)))

(defn *set-masked-values-to-zero
  "data - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (DataSetUtil/setMaskedValuesToZero data mask)))

(defn *merge-labels
  "Extract out the specified column, and merge the specified label and label mask arrays
  (i.e., concatenate the examples)

  labels-to-merge - Features to merge. Will use featuresToMerge[all][inOutIdx] - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  label-masks-to-merge - Mask arrays to merge. May be null - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - `int`

  returns: Merged features and mask. Mask may be null - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [labels-to-merge label-masks-to-merge ^Integer in-out-idx]
    (DataSetUtil/mergeLabels labels-to-merge label-masks-to-merge in-out-idx))
  (^org.nd4j.linalg.primitives.Pair [labels-to-merge label-masks-to-merge]
    (DataSetUtil/mergeLabels labels-to-merge label-masks-to-merge)))

(defn *merge-per-output-masks-2d
  "out-shape - `long[]`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  masks - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [out-shape arrays masks ^Integer in-out-idx]
    (DataSetUtil/mergePerOutputMasks2d out-shape arrays masks in-out-idx))
  (^org.nd4j.linalg.api.ndarray.INDArray [out-shape arrays masks]
    (DataSetUtil/mergePerOutputMasks2d out-shape arrays masks)))

(defn *merge-2d
  "Merge the specified 2d arrays and masks. See mergeFeatures(INDArray[], INDArray[])
  and mergeLabels(INDArray[], INDArray[])

  arrays - Arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  masks - Mask arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - Index to extract out before merging - `int`

  returns: Merged arrays and mask - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [arrays masks ^Integer in-out-idx]
    (DataSetUtil/merge2d arrays masks in-out-idx))
  (^org.nd4j.linalg.primitives.Pair [arrays masks]
    (DataSetUtil/merge2d arrays masks)))

(defn *merge-features
  "Extract out the specified column, and merge the specified features and mask arrays (i.e., concatenate the examples)

  features-to-merge - Features to merge. Will use featuresToMerge[all][inOutIdx] - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  feature-masks-to-merge - Mask arrays to merge. May be null - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - `int`

  returns: Merged features and mask. Mask may be null - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [features-to-merge feature-masks-to-merge ^Integer in-out-idx]
    (DataSetUtil/mergeFeatures features-to-merge feature-masks-to-merge in-out-idx))
  ([features-to-merge feature-masks-to-merge]
    (DataSetUtil/mergeFeatures features-to-merge feature-masks-to-merge)))

(defn *tailor-4d-2d
  "dataset - `org.nd4j.linalg.dataset.api.DataSet`
  are-features - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.dataset.api.DataSet dataset ^Boolean are-features]
    (DataSetUtil/tailor4d2d dataset are-features))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray data]
    (DataSetUtil/tailor4d2d data)))

(defn *merge-masks-2d
  "out-shape - `long[]`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  masks - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [out-shape arrays masks]
    (DataSetUtil/mergeMasks2d out-shape arrays masks)))

(defn *tailor-2d
  "data-set - `org.nd4j.linalg.dataset.api.DataSet`
  are-features - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.dataset.api.DataSet data-set ^Boolean are-features]
    (DataSetUtil/tailor2d data-set are-features)))

(defn *merge-time-series
  "Merge the specified time series (3d) arrays and masks. See mergeFeatures(INDArray[], INDArray[])
  and mergeLabels(INDArray[], INDArray[])

  arrays - Arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  masks - Mask arrays to merge - `org.nd4j.linalg.api.ndarray.INDArray[][]`
  in-out-idx - Index to extract out before merging - `int`

  returns: Merged arrays and mask - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [arrays masks ^Integer in-out-idx]
    (DataSetUtil/mergeTimeSeries arrays masks in-out-idx))
  (^org.nd4j.linalg.primitives.Pair [arrays masks]
    (DataSetUtil/mergeTimeSeries arrays masks)))

