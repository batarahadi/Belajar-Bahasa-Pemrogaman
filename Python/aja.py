
import cv2
import numpy as np

img = np.zeros((200,200,3), dtype=np.uint8)
cv2.putText(img, "OpenCV OK", (10,100),
            cv2.FONT_HERSHEY_SIMPLEX, 0.7, (255,255,255), 2)

cv2.imwrite("test_opencv.png", img)
print("file test_opencv.png dibuat")