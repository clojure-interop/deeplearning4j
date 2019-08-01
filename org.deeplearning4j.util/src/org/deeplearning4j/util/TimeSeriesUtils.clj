(ns org.deeplearning4j.util.TimeSeriesUtils
  "Basic time series utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util TimeSeriesUtils]))

(defn *reshape-time-series-mask-to-vector
  "Reshape time series mask arrays. This should match the assumptions (f order, etc) in RnnOutputLayer

  time-series-mask - Mask array to reshape to a column vector - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: Mask array as a column vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray time-series-mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reshapeTimeSeriesMaskToVector time-series-mask workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray time-series-mask]
    (TimeSeriesUtils/reshapeTimeSeriesMaskToVector time-series-mask)))

(defn *reshape-vector-to-time-series-mask
  "Reshape time series mask arrays. This should match the assumptions (f order, etc) in RnnOutputLayer

  time-series-mask-as-vector - Mask array to reshape to a column vector - `org.nd4j.linalg.api.ndarray.INDArray`
  minibatch-size - `int`

  returns: Mask array as a column vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray time-series-mask-as-vector ^Integer minibatch-size]
    (TimeSeriesUtils/reshapeVectorToTimeSeriesMask time-series-mask-as-vector minibatch-size)))

(defn *reverse-time-series-mask
  "Reverse a (per time step) time series mask, with shape [minibatch, timeSeriesLength]

  mask - Mask to reverse along time dimension - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: Mask after reversing - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reverseTimeSeriesMask mask workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask]
    (TimeSeriesUtils/reverseTimeSeriesMask mask)))

(defn *reshape-per-output-time-series-mask-to-2d
  "per-output-time-series-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray per-output-time-series-mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reshapePerOutputTimeSeriesMaskTo2d per-output-time-series-mask workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray per-output-time-series-mask]
    (TimeSeriesUtils/reshapePerOutputTimeSeriesMaskTo2d per-output-time-series-mask)))

(defn *reverse-time-series
  "Reverse an input time series along the time dimension

  in - Input activations to reverse, with shape [minibatch, size, timeSeriesLength] - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: Reversed activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reverseTimeSeries in workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (TimeSeriesUtils/reverseTimeSeries in)))

(defn *reshape-3d-to-2d
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reshape3dTo2d in workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (TimeSeriesUtils/reshape3dTo2d in)))

(defn *reshape-2d-to-3d
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/reshape2dTo3d in mini-batch-size workspace-mgr array-type))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer mini-batch-size]
    (TimeSeriesUtils/reshape2dTo3d in mini-batch-size)))

(defn *moving-average
  "Calculate a moving average given the length

  to-avg - the array to average - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the length of the moving window - `int`

  returns: the moving averages for each row - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-avg ^Integer n]
    (TimeSeriesUtils/movingAverage to-avg n)))

(defn *pull-last-time-steps
  "Extract out the last time steps (2d array from 3d array input) accounting for the mask layer, if present.

  pull-from - Input time series array (rank 3) to pull the last time steps from - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - Mask array (rank 2). May be null - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: 2d array of the last time steps - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,int[]>`"
  ([^org.nd4j.linalg.api.ndarray.INDArray pull-from ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (TimeSeriesUtils/pullLastTimeSteps pull-from mask workspace-mgr array-type))
  ([^org.nd4j.linalg.api.ndarray.INDArray pull-from ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (TimeSeriesUtils/pullLastTimeSteps pull-from mask)))

