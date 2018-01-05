namespace CatEars.Adapter.UI
{
    partial class Confirmation
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
            this.uxMessage = new System.Windows.Forms.Label();
            this.uxNo = new System.Windows.Forms.Button();
            this.uxYes = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // uxMessage
            // 
            this.uxMessage.AutoSize = true;
            this.uxMessage.Location = new System.Drawing.Point(75, 72);
            this.uxMessage.Name = "uxMessage";
            this.uxMessage.Size = new System.Drawing.Size(35, 13);
            this.uxMessage.TabIndex = 0;
            this.uxMessage.Text = "label1";
            // 
            // uxNo
            // 
            this.uxNo.Location = new System.Drawing.Point(12, 156);
            this.uxNo.Name = "uxNo";
            this.uxNo.Size = new System.Drawing.Size(75, 23);
            this.uxNo.TabIndex = 1;
            this.uxNo.Text = "No";
            this.uxNo.UseVisualStyleBackColor = true;
            this.uxNo.Click += new System.EventHandler(this.uxNo_Click);
            // 
            // uxYes
            // 
            this.uxYes.Location = new System.Drawing.Point(470, 156);
            this.uxYes.Name = "uxYes";
            this.uxYes.Size = new System.Drawing.Size(75, 23);
            this.uxYes.TabIndex = 2;
            this.uxYes.Text = "Yes";
            this.uxYes.UseVisualStyleBackColor = true;
            this.uxYes.Click += new System.EventHandler(this.uxYes_Click);
            // 
            // Confirmation
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(557, 191);
            this.Controls.Add(this.uxYes);
            this.Controls.Add(this.uxNo);
            this.Controls.Add(this.uxMessage);
            this.Name = "Confirmation";
            this.Text = "Confirmation";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label uxMessage;
        private System.Windows.Forms.Button uxNo;
        private System.Windows.Forms.Button uxYes;
    }
}