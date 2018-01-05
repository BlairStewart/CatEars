namespace CatEars.Adapter.UI
{
    partial class AddInteraction
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.uxInteractionType = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.uxCancel = new System.Windows.Forms.Button();
            this.uxSave = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // uxInteractionType
            // 
            this.uxInteractionType.FormattingEnabled = true;
            this.uxInteractionType.Location = new System.Drawing.Point(99, 12);
            this.uxInteractionType.Name = "uxInteractionType";
            this.uxInteractionType.Size = new System.Drawing.Size(121, 21);
            this.uxInteractionType.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(9, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(84, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Interaction Type";
            // 
            // uxCancel
            // 
            this.uxCancel.Location = new System.Drawing.Point(12, 194);
            this.uxCancel.Name = "uxCancel";
            this.uxCancel.Size = new System.Drawing.Size(75, 23);
            this.uxCancel.TabIndex = 2;
            this.uxCancel.Text = "Cancel";
            this.uxCancel.UseVisualStyleBackColor = true;
            this.uxCancel.Click += new System.EventHandler(this.uxCancel_Click);
            // 
            // uxSave
            // 
            this.uxSave.Location = new System.Drawing.Point(372, 194);
            this.uxSave.Name = "uxSave";
            this.uxSave.Size = new System.Drawing.Size(75, 23);
            this.uxSave.TabIndex = 3;
            this.uxSave.Text = "Save";
            this.uxSave.UseVisualStyleBackColor = true;
            this.uxSave.Click += new System.EventHandler(this.uxSave_Click);
            // 
            // AddInteraction
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(459, 229);
            this.Controls.Add(this.uxSave);
            this.Controls.Add(this.uxCancel);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.uxInteractionType);
            this.Name = "AddInteraction";
            this.Text = "AddInteraction";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox uxInteractionType;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button uxCancel;
        private System.Windows.Forms.Button uxSave;
    }
}