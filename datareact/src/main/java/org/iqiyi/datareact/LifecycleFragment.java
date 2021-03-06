/*
 * Copyright (C) 2017 The Android Open Source Project
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

package org.iqiyi.datareact;

import android.support.v4.app.Fragment;

/**
 * A fragment that is also a {@link LifecycleRegistryOwner}.
 * <p>
 * This class is a temporary implementation detail until Lifecycles are integrated with support
 * library.
 */
// This class will be removed once we integrate with Fragment library.
public class LifecycleFragment extends Fragment implements LifecycleRegistryOwner {
    LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    @Override
    public LifecycleRegistry getLifecycle() {
        return mLifecycleRegistry;
    }
}
