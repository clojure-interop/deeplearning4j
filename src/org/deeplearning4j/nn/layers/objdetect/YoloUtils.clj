(ns org.deeplearning4j.nn.layers.objdetect.YoloUtils
  "Functionality to interpret the network output of Yolo2OutputLayer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.objdetect YoloUtils]))

(defn ->yolo-utils
  "Constructor."
  (^YoloUtils []
    (new YoloUtils )))

(defn *activate
  "Essentially: just apply activation functions...

  bounding-box-priors - `org.nd4j.linalg.api.ndarray.INDArray`
  input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray bounding-box-priors ^org.nd4j.linalg.api.ndarray.INDArray input]
    (YoloUtils/activate bounding-box-priors input))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray bounding-box-priors ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr layer-workspace-mgr]
    (YoloUtils/activate bounding-box-priors input layer-workspace-mgr)))

(defn *overlap
  "Returns overlap between lines [x1, x2] and [x3. x4].

  x-1 - `double`
  x-2 - `double`
  x-3 - `double`
  x-4 - `double`

  returns: `double`"
  (^Double [^Double x-1 ^Double x-2 ^Double x-3 ^Double x-4]
    (YoloUtils/overlap x-1 x-2 x-3 x-4)))

(defn *iou
  "Returns intersection over union (IOU) between o1 and o2.

  o-1 - `org.deeplearning4j.nn.layers.objdetect.DetectedObject`
  o-2 - `org.deeplearning4j.nn.layers.objdetect.DetectedObject`

  returns: `double`"
  (^Double [^org.deeplearning4j.nn.layers.objdetect.DetectedObject o-1 ^org.deeplearning4j.nn.layers.objdetect.DetectedObject o-2]
    (YoloUtils/iou o-1 o-2)))

(defn *nms
  "Performs non-maximum suppression (NMS) on objects, using their IOU with threshold to match pairs.

  objects - `java.util.List`
  iou-threshold - `double`"
  ([^java.util.List objects ^Double iou-threshold]
    (YoloUtils/nms objects iou-threshold)))

(defn *get-predicted-objects
  "Given the network output and a detection threshold (in range 0 to 1) determine the objects detected by
  the network.
  Supports minibatches - the returned DetectedObject instances have an example number index.
  Note that the dimensions are grid cell units - for example, with 416x416 input, 32x downsampling by the network
  (before getting to the Yolo2OutputLayer) we have 13x13 grid cells (each corresponding to 32 pixels in the input
  image). Thus, a centerX of 5.5 would be xPixels=5.5x32 = 176 pixels from left. Widths and heights are similar:
  in this example, a with of 13 would be the entire image (416 pixels), and a height of 6.5 would be 6.5/13 = 0.5
  of the image (208 pixels).

  bounding-box-priors - as given to Yolo2OutputLayer - `org.nd4j.linalg.api.ndarray.INDArray`
  network-output - 4d activations out of the network - `org.nd4j.linalg.api.ndarray.INDArray`
  conf-threshold - Detection threshold, in range 0.0 (least strict) to 1.0 (most strict). Objects are returnedwhere predicted confidence is >= confThreshold - `double`
  nms-threshold - passed to nms(List, double) (0 == disabled) as the threshold for intersection over union (IOU) - `double`

  returns: List of detected objects - `java.util.List<org.deeplearning4j.nn.layers.objdetect.DetectedObject>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray bounding-box-priors ^org.nd4j.linalg.api.ndarray.INDArray network-output ^Double conf-threshold ^Double nms-threshold]
    (YoloUtils/getPredictedObjects bounding-box-priors network-output conf-threshold nms-threshold)))

