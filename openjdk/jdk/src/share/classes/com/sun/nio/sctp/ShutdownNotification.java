/*
 * Copyright 2009 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
package com.sun.nio.sctp;

/**
 * Notification emitted when a peers shutdowns an the association.
 *
 * <P> When a peer sends a <i>SHUTDOWN</i>, the SCTP stack delivers this
 * notification to inform the application that it should cease sending data.
 *
 * @since 1.7
 */
public abstract class ShutdownNotification implements Notification {
    /**
     * Initializes a new instance of this class.
     */
    protected ShutdownNotification() {}

    /**
     * Returns the association that this notification is applicable to.
     *
     * @return  The association that received the shutdown
     */
    public abstract Association association();
}
