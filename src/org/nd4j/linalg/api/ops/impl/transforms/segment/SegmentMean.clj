(ns org.nd4j.linalg.api.ops.impl.transforms.segment.SegmentMean
  "Segment mean operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.segment SegmentMean]))

(defn ->segment-mean
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`"
  (^SegmentMean [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (new SegmentMean same-diff data segment-ids))
  (^SegmentMean []
    (new SegmentMean )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SegmentMean this]
    (-> this (.opName))))

