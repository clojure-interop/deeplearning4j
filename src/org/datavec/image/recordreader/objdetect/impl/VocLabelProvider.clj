(ns org.datavec.image.recordreader.objdetect.impl.VocLabelProvider
  "Label provider for object detection, for use with ObjectDetectionRecordReader.
 This label provider reads the datasets from the the PASCAL Visual Object Classes - VOC2007 to VOC2012 datasets.
 The VOC datasets contain 20 classes and (for VOC2012) 17,125 images.
 http://host.robots.ox.ac.uk/pascal/VOC/voc2007/
 http://host.robots.ox.ac.uk/pascal/VOC/voc2012/


 How to use:
 1. Download and extract VOC dataset
 2. Set baseDirectory to (for example) VOC2012 directory (should contain JPEGImages and Annotations directories)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader.objdetect.impl VocLabelProvider]))

(defn ->voc-label-provider
  "Constructor.

  base-directory - `java.lang.String`"
  (^VocLabelProvider [^java.lang.String base-directory]
    (new VocLabelProvider base-directory)))

(defn get-image-objects-for-path
  "path - `java.lang.String`

  returns: `java.util.List<org.datavec.image.recordreader.objdetect.ImageObject>`"
  (^java.util.List [^VocLabelProvider this ^java.lang.String path]
    (-> this (.getImageObjectsForPath path))))

