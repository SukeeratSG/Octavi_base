/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.notification.collection;

import android.service.notification.NotificationStats.DismissalSentiment;
import android.service.notification.NotificationStats.DismissalSurface;

import com.android.internal.statusbar.NotificationVisibility;

/** Information that must be supplied when dismissing a notification on the behalf of the user. */
public class DismissedByUserStats {
    public final @DismissalSurface int dismissalSurface;
    public final @DismissalSentiment int dismissalSentiment;
    public final NotificationVisibility notificationVisibility;

    public DismissedByUserStats(
            @DismissalSurface int dismissalSurface,
            @DismissalSentiment int dismissalSentiment,
            NotificationVisibility notificationVisibility) {
        this.dismissalSurface = dismissalSurface;
        this.dismissalSentiment = dismissalSentiment;
        this.notificationVisibility = notificationVisibility;
    }
}
